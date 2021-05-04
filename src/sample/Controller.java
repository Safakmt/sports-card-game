package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image ;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public class Controller implements Initializable {              //TEST SINIFI


        @FXML
        private ImageView img1;

        @FXML
        private ImageView img2;

        @FXML
        private ImageView img3;

        @FXML
        private ImageView img4;

        @FXML
        private ImageView img5;

        @FXML
        private ImageView img6;

        @FXML
        private ImageView img7;

        @FXML
        private ImageView img8;

        @FXML
        private ImageView selected1;

        @FXML
        private ImageView selected2;

        @FXML
        private Label pozisyon;

        @FXML
        private Label sb1;

        @FXML
        private Label sb2;

        @FXML
        private Label tur;


        ArrayList<ImageView> imgs = new ArrayList<>();
        ArrayList<Futbolcu> altf = new ArrayList<>();
        ArrayList<Basketbolcu> altb = new ArrayList<>();
        ArrayList<Futbolcu> ustf = new ArrayList<>();
        ArrayList<Basketbolcu> ustb = new ArrayList<>();
        ArrayList<Futbolcu> futbolcular = new ArrayList<>();
        ArrayList<Basketbolcu> basketbolcular = new ArrayList<>();

        Futbolcu messi = new Futbolcu("messi","bercelona",100,96,90,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\messi.jpg"));
        Futbolcu dybala = new Futbolcu("dybala","juventus",84,76,90,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\dybala.jpg"));
        Futbolcu ibrahim = new Futbolcu("ibrahimovic","milan",90,85,75,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\ibrahim.jpg"));
        Futbolcu mbappe = new Futbolcu("mbappe","paris s-g",85,75,95,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\mbappe.jpg"));
        Futbolcu neymar = new Futbolcu("neymar","paris s-g",80,70,90,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\neymar.jpg"));
        Futbolcu quaresma = new Futbolcu("quaresma","vitoria",92,84,72,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\quaresma.jpg"));
        Futbolcu ronaldo = new Futbolcu("ronaldo","juventus",95,80,90,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\ronaldo.jpg"));
        Futbolcu salah = new Futbolcu("salah","liverpool",92,75,95,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\salah.jpg"));
        Basketbolcu cedi = new Basketbolcu("cedi","a",80,82,75,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\cedi.jpg"));
        Basketbolcu curry = new Basketbolcu("curry","b",80,98,90,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\curry.jpg"));
        Basketbolcu harden = new Basketbolcu("harden","c",94,96,93,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\harden.jpg"));
        Basketbolcu kobe = new Basketbolcu("kobe","d",99,98,95,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\kobe.jpg"));
        Basketbolcu lebron = new Basketbolcu("lebron","e",95,95,95,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\lebron.jpg"));
        Basketbolcu nando = new Basketbolcu("nando","f",75,70,70,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\nando.jpg"));
        Basketbolcu shaq = new Basketbolcu("shaq","g",100,20,10,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\shaq.jpg"));
        Basketbolcu yannis = new Basketbolcu("yannis","h",87,85,83,false, new Image("File:C:\\Users\\safak\\IdeaProjects\\prolabb\\src\\foto\\yannis.jpg"));
        Kullanici player = new Kullanici(1,"Oyuncu",0);
        Bilgisayar pc = new Bilgisayar(2,"PC",0);
        Random rnd = new Random();
        int a,b,c=8;
        boolean sira=true;

        @FXML
        public void kazanan(){
                c--;
                if (c==0){
                        if (pc.getSkor()<player.getSkor())
                                tur.setText("Oyuncu Kazandı");

                        else if (pc.getSkor()>player.getSkor())
                                tur.setText("Bilgisayar Kazandı");

                        else
                                tur.setText("Berabere");
                }
        }

        @FXML
        public void turf(){
                if (sira){
                        tur.setText("Basketbolcu seçin");
                        sira=false;
                }
                else{
                        tur.setText("Futbolcu seçin");
                        sira=true;
                }
        }

        @FXML
        public void kartDagit(){

                Random rnd = new Random();
                futbolcular.add(messi);
                futbolcular.add(dybala);
                futbolcular.add(ibrahim);
                futbolcular.add(mbappe);
                futbolcular.add(neymar);
                futbolcular.add(quaresma);
                futbolcular.add(ronaldo);
                futbolcular.add(salah);
                basketbolcular.add(cedi);
                basketbolcular.add(curry);
                basketbolcular.add(harden);
                basketbolcular.add(kobe);
                basketbolcular.add(lebron);
                basketbolcular.add(nando);
                basketbolcular.add(shaq);
                basketbolcular.add(yannis);

                imgs.add(img1);
                imgs.add(img2);
                imgs.add(img3);
                imgs.add(img4);
                imgs.add(img5);
                imgs.add(img6);
                imgs.add(img7);
                imgs.add(img8);

                int tmp;

                for (int i = 0; i < 4; i++) {

                        tmp = rnd.nextInt(futbolcular.size()-1);
                        imgs.get(i).setImage(futbolcular.get(tmp).getFoto());
                        altf.add(futbolcular.get(tmp));
                        futbolcular.remove(tmp);
                }

                for (int i=4; i<8; i++){
                        tmp = rnd.nextInt(basketbolcular.size()-1);
                        imgs.get(i).setImage(basketbolcular.get(tmp).getFoto());
                        altb.add(basketbolcular.get(tmp));
                        basketbolcular.remove(tmp);
                }
                ustb = basketbolcular;
                ustf = futbolcular;
                sb1.setText("Oyuncu:0");
                sb2.setText("Bilgisayar:0");
              
        }


        @FXML
        void tikla1(MouseEvent event) throws InterruptedException {

                a= rnd.nextInt(ustf.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altf.get(0).getFoto());
                img1.setVisible(false);
                turf();
                switch (a){ //Bilgisayar oyuncu seçimi
                        case 0:
                                selected2.setImage(ustf.get(0).getFoto());
                                System.out.println(ustf.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustf.get(1).getFoto());
                                System.out.println(ustf.get(1).getSporcuIsim());
                                break;
                        case 2:
                                selected2.setImage(ustf.get(2).getFoto());
                                System.out.println(ustf.get(2).getSporcuIsim());
                                break;
                        case 3:
                                selected2.setImage(ustf.get(3).getFoto());
                                System.out.println(ustf.get(3).getSporcuIsim());
                                break;

                }
                switch (b){     // random pozisyon seçimi
                        case 0:
                                pozisyon.setText("Penaltı");
                                if (altf.get(0).getPenalti()<ustf.get(a).getPenalti()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(0).getPenalti()>ustf.get(a).getPenalti()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img1.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }

                                break;
                        case 1:
                                pozisyon.setText("Serbest Vuruş");
                                if (altf.get(0).getSerbestAtis()<ustf.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(0).getSerbestAtis()>ustf.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img1.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;
                        case 2:
                                pozisyon.setText("Kaleciye Karşı");
                                if (altf.get(0).getKaleci()<ustf.get(a).getKaleci()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(0).getKaleci()>ustf.get(a).getKaleci()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img1.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());

        }

        @FXML
        void tikla2(MouseEvent event) throws InterruptedException {


                a= rnd.nextInt(ustf.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altf.get(1).getFoto());
                img2.setVisible(false);
                turf();

                switch (a){
                        case 0:
                                selected2.setImage(ustf.get(0).getFoto());
                                System.out.println(ustf.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustf.get(1).getFoto());
                                System.out.println(ustf.get(1).getSporcuIsim());

                                break;
                        case 2:
                                selected2.setImage(ustf.get(2).getFoto());
                                System.out.println(ustf.get(2).getSporcuIsim());

                                break;
                        case 3:
                                selected2.setImage(ustf.get(3).getFoto());
                                System.out.println(ustf.get(3).getSporcuIsim());

                                break;

                }
                switch (b){
                        case 0:
                                pozisyon.setText("Penaltı");
                                if (altf.get(1).getPenalti()<ustf.get(a).getPenalti()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(1).getPenalti()>ustf.get(a).getPenalti()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img2.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;
                        case 1:
                                pozisyon.setText("Serbest Vuruş");
                                if (altf.get(1).getSerbestAtis()<ustf.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(1).getSerbestAtis()>ustf.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img2.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;
                        case 2:
                                pozisyon.setText("Kaleciye Karşı");
                                if (altf.get(1).getKaleci()<ustf.get(a).getKaleci()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(1).getKaleci()>ustf.get(a).getKaleci()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img2.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());


        }

        @FXML
        void tikla3(MouseEvent event) throws InterruptedException {

                a= rnd.nextInt(ustf.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altf.get(2).getFoto());
                img3.setVisible(false);
                turf();

                switch (a){ //Bilgisayar oyuncu seçimi
                        case 0:
                                selected2.setImage(ustf.get(0).getFoto());
                                System.out.println(ustf.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustf.get(1).getFoto());
                                System.out.println(ustf.get(1).getSporcuIsim());
                                break;
                        case 2:
                                selected2.setImage(ustf.get(2).getFoto());
                                System.out.println(ustf.get(2).getSporcuIsim());
                                break;
                        case 3:
                                selected2.setImage(ustf.get(3).getFoto());
                                System.out.println(ustf.get(3).getSporcuIsim());
                                break;

                }
                switch (b){     // random pozisyon seçimi
                        case 0:
                                pozisyon.setText("Penaltı");
                                if (altf.get(2).getPenalti()<ustf.get(a).getPenalti()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(2).getPenalti()>ustf.get(a).getPenalti()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img3.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }

                                break;
                        case 1:
                                pozisyon.setText("Serbest Vuruş");
                                if (altf.get(2).getSerbestAtis()<ustf.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(2).getSerbestAtis()>ustf.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img3.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;
                        case 2:
                                pozisyon.setText("Kaleciye Karşı");
                                if (altf.get(2).getKaleci()<ustf.get(a).getKaleci()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(2).getKaleci()>ustf.get(a).getKaleci()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img3.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());


        }

        @FXML
        void tikla4(MouseEvent event) throws InterruptedException {


                a= rnd.nextInt(ustf.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altf.get(3).getFoto());
                img4.setVisible(false);
                turf();

                switch (a){ //Bilgisayar oyuncu seçimi
                        case 0:
                                selected2.setImage(ustf.get(0).getFoto());
                                System.out.println(ustf.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustf.get(1).getFoto());
                                System.out.println(ustf.get(1).getSporcuIsim());
                                break;
                        case 2:
                                selected2.setImage(ustf.get(2).getFoto());
                                System.out.println(ustf.get(2).getSporcuIsim());
                                break;
                        case 3:
                                selected2.setImage(ustf.get(3).getFoto());
                                System.out.println(ustf.get(3).getSporcuIsim());
                                break;

                }
                switch (b){     // random pozisyon seçimi
                        case 0:
                                pozisyon.setText("Penaltı");
                                if (altf.get(3).getPenalti()<ustf.get(a).getPenalti()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(3).getPenalti()>ustf.get(a).getPenalti()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img4.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }

                                break;
                        case 1:
                                pozisyon.setText("Serbest Vuruş");
                                if (altf.get(3).getSerbestAtis()<ustf.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(3).getSerbestAtis()>ustf.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img4.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;
                        case 2:
                                pozisyon.setText("Kaleciye Karşı");
                                if (altf.get(3).getKaleci()<ustf.get(a).getKaleci()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else if (altf.get(3).getKaleci()>ustf.get(a).getKaleci()){
                                        player.setSkor(player.getSkor()+10);
                                        ustf.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img4.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=false;
                                        turf();
                                }
                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());



        }


        @FXML
        void tikla5(MouseEvent event) throws InterruptedException {

                a= rnd.nextInt(ustb.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altb.get(0).getFoto());
                img5.setVisible(false);
                turf();

                switch (a){ //Bilgisayar oyuncu seçimi
                        case 0:
                                selected2.setImage(ustb.get(0).getFoto());
                                System.out.println(ustb.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustb.get(1).getFoto());
                                System.out.println(ustb.get(1).getSporcuIsim());
                                break;
                        case 2:
                                selected2.setImage(ustb.get(2).getFoto());
                                System.out.println(ustb.get(2).getSporcuIsim());
                                break;
                        case 3:
                                selected2.setImage(ustb.get(3).getFoto());
                                System.out.println(ustb.get(3).getSporcuIsim());
                                break;

                }
                switch (b){     // random pozisyon seçimi
                        case 0:
                                pozisyon.setText("İkilik");
                                if (altb.get(0).getIkilik()<ustb.get(a).getIkilik()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(0).getIkilik()>ustb.get(a).getIkilik()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img5.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();
                                }

                                break;
                        case 1:
                                pozisyon.setText("Üçlük");
                                if (altb.get(0).getUcluk()<ustb.get(a).getUcluk()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(0).getUcluk()>ustb.get(a).getUcluk()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img5.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }
                                break;
                        case 2:
                                pozisyon.setText("Serbest Atış");
                                if (altb.get(0).getSerbestAtis()<ustb.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(0).getSerbestAtis()>ustb.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img5.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }
                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());


        }

        @FXML
        void tikla6(MouseEvent event) throws InterruptedException {

                a= rnd.nextInt(ustb.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altb.get(1).getFoto());
                img6.setVisible(false);
                turf();

                switch (a){ //Bilgisayar oyuncu seçimi
                        case 0:
                                selected2.setImage(ustb.get(0).getFoto());
                                System.out.println(ustb.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustb.get(1).getFoto());
                                System.out.println(ustb.get(1).getSporcuIsim());
                                break;
                        case 2:
                                selected2.setImage(ustb.get(2).getFoto());
                                System.out.println(ustb.get(2).getSporcuIsim());
                                break;
                        case 3:
                                selected2.setImage(ustb.get(3).getFoto());
                                System.out.println(ustb.get(3).getSporcuIsim());
                                break;

                }
                switch (b){     // random pozisyon seçimi
                        case 0:
                                pozisyon.setText("İkilik");
                                if (altb.get(1).getIkilik()<ustb.get(a).getIkilik()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(1).getIkilik()>ustb.get(a).getIkilik()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img6.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }

                                break;
                        case 1:
                                pozisyon.setText("Üçlük");
                                if (altb.get(1).getUcluk()<ustb.get(a).getUcluk()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(1).getUcluk()>ustb.get(a).getUcluk()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img6.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }
                                break;
                        case 2:
                                pozisyon.setText("Serbest Atış");
                                if (altb.get(1).getSerbestAtis()<ustb.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(1).getSerbestAtis()>ustb.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img6.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }
                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());



        }

        @FXML
        void tikla7(MouseEvent event) throws InterruptedException {

                a= rnd.nextInt(ustb.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altb.get(2).getFoto());
                img7.setVisible(false);
                turf();

                switch (a){ //Bilgisayar oyuncu seçimi
                        case 0:
                                selected2.setImage(ustb.get(0).getFoto());
                                System.out.println(ustb.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustb.get(1).getFoto());
                                System.out.println(ustb.get(1).getSporcuIsim());
                                break;
                        case 2:
                                selected2.setImage(ustb.get(2).getFoto());
                                System.out.println(ustb.get(2).getSporcuIsim());
                                break;
                        case 3:
                                selected2.setImage(ustb.get(3).getFoto());
                                System.out.println(ustb.get(3).getSporcuIsim());
                                break;

                }
                switch (b){     // random pozisyon seçimi
                        case 0:
                                pozisyon.setText("İkilik");
                                if (altb.get(2).getIkilik()<ustb.get(a).getIkilik()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(2).getIkilik()>ustb.get(a).getIkilik()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img7.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }

                                break;
                        case 1:
                                pozisyon.setText("Üçlük");
                                if (altb.get(2).getUcluk()<ustb.get(a).getUcluk()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(2).getUcluk()>ustb.get(a).getUcluk()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img7.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }
                                break;
                        case 2:
                                pozisyon.setText("Serbest Atış");
                                if (altb.get(2).getSerbestAtis()<ustb.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(2).getSerbestAtis()>ustb.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img7.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }
                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());


        }

        @FXML
        void tikla8(MouseEvent event) throws InterruptedException {

                a= rnd.nextInt(ustb.size());
                System.out.println(a);
                b= rnd.nextInt(3);
                selected1.setImage(altb.get(3).getFoto());
                img8.setVisible(false);
                turf();

                switch (a){ //Bilgisayar oyuncu seçimi
                        case 0:
                                selected2.setImage(ustb.get(0).getFoto());
                                System.out.println(ustb.get(0).getSporcuIsim());
                                break;
                        case 1:
                                selected2.setImage(ustb.get(1).getFoto());
                                System.out.println(ustb.get(1).getSporcuIsim());
                                break;
                        case 2:
                                selected2.setImage(ustb.get(2).getFoto());
                                System.out.println(ustb.get(2).getSporcuIsim());
                                break;
                        case 3:
                                selected2.setImage(ustb.get(3).getFoto());
                                System.out.println(ustb.get(3).getSporcuIsim());
                                break;

                }
                switch (b){     // random pozisyon seçimi
                        case 0:
                                pozisyon.setText("İkilik");
                                if (altb.get(3).getIkilik()<ustb.get(a).getIkilik()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(3).getIkilik()>ustb.get(a).getIkilik()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img8.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }

                                break;
                        case 1:
                                pozisyon.setText("Üçlük");
                                if (altb.get(3).getUcluk()<ustb.get(a).getUcluk()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(3).getUcluk()>ustb.get(a).getUcluk()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img8.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();

                                }

                                break;
                        case 2:
                                pozisyon.setText("Serbest Atış");
                                if (altb.get(3).getSerbestAtis()<ustb.get(a).getSerbestAtis()){
                                        pc.setSkor(pc.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else if (altb.get(3).getSerbestAtis()>ustb.get(a).getSerbestAtis()){
                                        player.setSkor(player.getSkor()+10);
                                        ustb.remove(a);
                                        kazanan();
                                }
                                else{
                                        pozisyon.setText("Berabere");
                                        TimeUnit.SECONDS.sleep(1);
                                        img8.setVisible(true);
                                        selected1.setImage(null);
                                        selected2.setImage(null);
                                        sira=true;
                                        turf();
                                }

                                break;

                }


                sb1.setText("Oyuncu: "+player.getSkor());
                sb2.setText("Bilgisayar: "+pc.getSkor());


        }




        @Override
    public void initialize(URL location, ResourceBundle resources) {

                kartDagit();
                turf();


    }
}
