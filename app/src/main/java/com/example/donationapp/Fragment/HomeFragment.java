package com.example.donationapp.Fragment;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.donationapp.Adapter.AllCardAdapter;
import com.example.donationapp.Adapter.CardAdapter;
import com.example.donationapp.Model.Card;
import com.example.donationapp.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private View view;
    private RecyclerView SyriaRecycleView,TurkeyRecycleView,AllDonationsRecycleView;
    private MaterialCardView AddAll,AddTurkie,AddSyria;
    private EditText PriceInput,TitleInput;
    private RadioButton SyriaRadio,TurkieRadio,image1,image2,image3,image4;
    private TextView btn_no,btn_yes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        InisializationOfFealds();

        Syria();

        Turkie();

        All();

        return view;
    }
    private void InisializationOfFealds(){
        SyriaRecycleView = view.findViewById(R.id.SyriaRecycleView);
        TurkeyRecycleView = view.findViewById(R.id.TurkeyRecycleView);
        AllDonationsRecycleView = view.findViewById(R.id.AllDonationsRecycleView);
        AddAll = view.findViewById(R.id.AddAll);
        AddTurkie = view.findViewById(R.id.AddTurkie);
        AddSyria = view.findViewById(R.id.AddSyria);
    }
    private void Syria(){
        ArrayList<Card> CardSyria = new ArrayList<>();
        CardSyria.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.earthquake,R.drawable.syria));
        CardSyria.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake1,R.drawable.syria));
        CardSyria.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake2,R.drawable.syria));
        CardSyria.add(new Card("donate for hunger people","1000000","95%",R.drawable.child2,R.drawable.syria));
        CardSyria.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,R.drawable.syria));
        CardAdapter adaptersyria = new CardAdapter(CardSyria, getActivity());
        SyriaRecycleView.setAdapter(adaptersyria);

        LinearLayoutManager managersyria = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        SyriaRecycleView.setLayoutManager(managersyria);

        AddSyria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(CardSyria);

            }
        });
    }
    private void Turkie(){
        ArrayList<Card> CardTurkey = new ArrayList<>();
        CardTurkey.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.child2,R.drawable.turkey));
        CardTurkey.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake,R.drawable.turkey));
        CardTurkey.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake1,R.drawable.turkey));
        CardTurkey.add(new Card("donate for hunger people","1000000","95%",R.drawable.earthquake2,R.drawable.turkey));
        CardTurkey.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,R.drawable.turkey));
        CardAdapter adapterturkey = new CardAdapter(CardTurkey, getActivity());
        TurkeyRecycleView.setAdapter(adapterturkey);

        LinearLayoutManager managerturkey = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        TurkeyRecycleView.setLayoutManager(managerturkey);

        AddTurkie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(CardTurkey);
            }
        });
    }
    private void All(){
        ArrayList<Card> AllCards = new ArrayList<>();
        AllCards.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.child2,R.drawable.turkey));
        AllCards.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake,R.drawable.syria));
        AllCards.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake1,R.drawable.syria));
        AllCards.add(new Card("donate for hunger people","1000000","95%",R.drawable.earthquake2,R.drawable.turkey));
        AllCards.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,R.drawable.syria));
        AllCardAdapter adapter = new AllCardAdapter(AllCards, getActivity());
        AllDonationsRecycleView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        AllDonationsRecycleView.setLayoutManager(manager);

        AddAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(AllCards);
            }
        });
    }
    public void openDialog(ArrayList<Card> Card) {
        Dialog dialog = new Dialog(getActivity(),R.style.CustomDialogTheme);
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View CustomDialog = layoutInflater.inflate(R.layout.add_dialog,null);

        TitleInput = CustomDialog.findViewById(R.id.TitleInput);
        PriceInput = CustomDialog.findViewById(R.id.PriceInput);

        SyriaRadio = CustomDialog.findViewById(R.id.SyriaRadio);
        TurkieRadio = CustomDialog.findViewById(R.id.TurkieRadio);

        image1 = CustomDialog.findViewById(R.id.image1);
        image2 = CustomDialog.findViewById(R.id.image2);
        image3 = CustomDialog.findViewById(R.id.image3);
        image4 = CustomDialog.findViewById(R.id.image4);

        btn_no = CustomDialog.findViewById(R.id.btn_no);
        btn_yes = CustomDialog.findViewById(R.id.btn_yes);

        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((TitleInput.getText().toString()!=null)
                        && (PriceInput.getText().toString()!=null)
                        && ((SyriaRadio.isChecked()) || (TurkieRadio.isChecked()))
                        &&((image1.isChecked()) || (image2.isChecked()) || (image3.isChecked()) || (image4.isChecked()))){

                    int flag = R.drawable.syria;

                    if (SyriaRadio.isChecked()){
                        flag = R.drawable.syria;
                    }else if (TurkieRadio.isChecked()){
                        flag = R.drawable.turkey;
                    }

                    int image = R.drawable.earthquake;

                    if (image1.isChecked()){
                        image = R.drawable.earthquake;
                    }else if (image2.isChecked()){
                        image = R.drawable.earthquake1;
                    }else if (image3.isChecked()){
                        image = R.drawable.earthquake2;
                    }else if (image4.isChecked()){
                        image = R.drawable.child2;
                    }

                    Card.add(new Card(TitleInput.getText().toString(),PriceInput.getText().toString(),image,flag));
                    Toast.makeText(getActivity(),"successful",Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }else {
                    Toast.makeText(getActivity(),"Field is empty",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });

        dialog.setContentView(CustomDialog);

        dialog.show();
    }

}