package com.example.donationapp.Fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    private ArrayList<Card> card = new ArrayList<>();
    private ArrayList<ArrayList<Card>> list = new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<Card>>> lists = new ArrayList<ArrayList<ArrayList<Card>>>();
    private int[] index = new int[100];
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        setHasOptionsMenu(true);

        InisializationOfFealds();
        FetchList(lists.get(0),R.drawable.syria);
        registerForContextMenu(view.findViewById(R.id.contextmenu));
        return view;
    }
    private void InisializationOfFealds(){
        SyriaRecycleView = view.findViewById(R.id.SyriaRecycleView);
        TurkeyRecycleView = view.findViewById(R.id.TurkeyRecycleView);
        AllDonationsRecycleView = view.findViewById(R.id.AllDonationsRecycleView);
        AddAll = view.findViewById(R.id.AddAll);
        AddTurkie = view.findViewById(R.id.AddTurkie);
        AddSyria = view.findViewById(R.id.AddSyria);
        for (int i = 0; i < 4; i++){
            list.add(card);
        }
        for (int i = 0; i < 4; i++){
            lists.add(list);
        }

    }
    private void Syria(ArrayList<ArrayList<Card>> list,int Flag){
        ArrayList<Card> Cardsyria = new ArrayList<>();
        if (list.get(0) != null){
            Cardsyria.equals(list.get(0));
            Cardsyria.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.earthquake,Flag));
            Cardsyria.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake1,Flag));
            Cardsyria.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake2,Flag));
            Cardsyria.add(new Card("donate for hunger people","1000000","95%",R.drawable.child2,Flag));
            Cardsyria.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,Flag));
            CardAdapter adaptersyria = new CardAdapter(Cardsyria, getActivity());
            SyriaRecycleView.setAdapter(adaptersyria);

            LinearLayoutManager managersyria = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
            SyriaRecycleView.setLayoutManager(managersyria);

            AddSyria.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openDialog(Cardsyria);
                }
            });
        }else {
            AddSyria.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openDialog(Cardsyria);
                }
            });
            CardAdapter adaptersyria = new CardAdapter(Cardsyria, getActivity());
            SyriaRecycleView.setAdapter(adaptersyria);

            LinearLayoutManager managersyria = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
            SyriaRecycleView.setLayoutManager(managersyria);
        }

    }
    private void Turkie(ArrayList<ArrayList<Card>> list,int Flag){
        ArrayList<Card> CardTurkey = new ArrayList<>();
        if (list.get(1) != null){
            CardTurkey.equals(list.get(1));
            CardTurkey.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.child2,Flag));
            CardTurkey.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake,Flag));
            CardTurkey.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake1,Flag));
            CardTurkey.add(new Card("donate for hunger people","1000000","95%",R.drawable.earthquake2,Flag));
            CardTurkey.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,Flag));
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
        }else {
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

    }
    private void All(ArrayList<ArrayList<Card>> list,int Flag){
        ArrayList<Card> AllCards = new ArrayList<>();
        if (list.get(2) != null){
            AllCards.equals(list.get(2));
            AllCards.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.child2,Flag));
            AllCards.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake,Flag));
            AllCards.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake1,Flag));
            AllCards.add(new Card("donate for hunger people","1000000","95%",R.drawable.earthquake2,Flag));
            AllCards.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,Flag));
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
        }else {
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
    public void FetchList(ArrayList<ArrayList<Card>> listNumber,int Flag){
        Syria(listNumber,Flag);
        Turkie(listNumber,Flag);
        All(listNumber,Flag);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        getActivity().getMenuInflater().inflate(R.menu.menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.AddNewList:
                ArrayList<ArrayList<Card>> list = new ArrayList<>();
                for (int i = 0; i < 4; i++){
                    list.add(null);
                }
                lists.add(list);
                FetchList(lists.get(lists.size()-1),R.drawable.syria);
                Toast.makeText(getActivity(),"List number "+String.valueOf(lists.size())+" Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.DeleteCurrentList:
                if (lists.size() > 1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setMessage("you really want to delete!!");
                    builder.setTitle("Delete");
                    builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            lists.remove(lists.size()-1);
                            FetchList(lists.get(lists.size()-1),R.drawable.syria);
                            Toast.makeText(getActivity(),"list number "+String.valueOf(lists.size()+1)+" was deleted",Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            builder.setCancelable(true);
                        }
                    });

                    builder.show();
                }
                break;
            case R.id.about:
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage("Donation app developee par vous ;)");
                builder.setTitle("A propos");
                builder.setNeutralButton("ok",null);
                builder.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(@NonNull ContextMenu menu, @NonNull View v, @Nullable ContextMenu.ContextMenuInfo menuInfo) {
        for (int i = 0; i < lists.size(); i++){
            MenuItem menu3 = menu.add(Menu.NONE, index[i]=i, i, "list "+(i+1));
            menu3.setAlphabeticShortcut('c');
        }

        getActivity().getMenuInflater().inflate(R.menu.contextmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        for (int i = 0; i < lists.size(); i++) {
            if (item.getItemId() == index[i]){
                if (( i % 2 ) == 0){
                    FetchList(lists.get(i),R.drawable.syria);
                    Toast.makeText(getActivity(),"List "+(i+1),Toast.LENGTH_SHORT).show();
                }else{
                    FetchList(lists.get(i),R.drawable.turkey);
                    Toast.makeText(getActivity(),"List "+(i+1),Toast.LENGTH_SHORT).show();
                }
            }
        }
        return super.onContextItemSelected(item);
    }
}