package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import sample.Djikstra.Node;
import sample.OyunVeKarakterler.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Controller {
    @FXML ImageView AzmanYol; @FXML ImageView GargamelYol;
    @FXML ImageView id_0_0; @FXML ImageView id_1_0; @FXML ImageView id_2_0; @FXML ImageView id_3_0; @FXML ImageView id_4_0; @FXML ImageView id_5_0; @FXML ImageView id_6_0; @FXML ImageView id_7_0; @FXML ImageView id_8_0; @FXML ImageView id_9_0; @FXML ImageView id_10_0; @FXML ImageView id_11_0; @FXML ImageView id_12_0;
    @FXML ImageView id_0_1; @FXML ImageView id_1_1; @FXML ImageView id_2_1; @FXML ImageView id_3_1; @FXML ImageView id_4_1; @FXML ImageView id_5_1; @FXML ImageView id_6_1; @FXML ImageView id_7_1; @FXML ImageView id_8_1; @FXML ImageView id_9_1; @FXML ImageView id_10_1; @FXML ImageView id_11_1; @FXML ImageView id_12_1;
    @FXML ImageView id_0_2; @FXML ImageView id_1_2; @FXML ImageView id_2_2; @FXML ImageView id_3_2; @FXML ImageView id_4_2; @FXML ImageView id_5_2; @FXML ImageView id_6_2; @FXML ImageView id_7_2; @FXML ImageView id_8_2; @FXML ImageView id_9_2; @FXML ImageView id_10_2; @FXML ImageView id_11_2; @FXML ImageView id_12_2;
    @FXML ImageView id_0_3; @FXML ImageView id_1_3; @FXML ImageView id_2_3; @FXML ImageView id_3_3; @FXML ImageView id_4_3; @FXML ImageView id_5_3; @FXML ImageView id_6_3; @FXML ImageView id_7_3; @FXML ImageView id_8_3; @FXML ImageView id_9_3; @FXML ImageView id_10_3; @FXML ImageView id_11_3; @FXML ImageView id_12_3;
    @FXML ImageView id_0_4; @FXML ImageView id_1_4; @FXML ImageView id_2_4; @FXML ImageView id_3_4; @FXML ImageView id_4_4; @FXML ImageView id_5_4; @FXML ImageView id_6_4; @FXML ImageView id_7_4; @FXML ImageView id_8_4; @FXML ImageView id_9_4; @FXML ImageView id_10_4; @FXML ImageView id_11_4; @FXML ImageView id_12_4;
    @FXML ImageView id_0_5; @FXML ImageView id_1_5; @FXML ImageView id_2_5; @FXML ImageView id_3_5; @FXML ImageView id_4_5; @FXML ImageView id_5_5; @FXML ImageView id_6_5; @FXML ImageView id_7_5; @FXML ImageView id_8_5; @FXML ImageView id_9_5; @FXML ImageView id_10_5; @FXML ImageView id_11_5; @FXML ImageView id_12_5;
    @FXML ImageView id_0_6; @FXML ImageView id_1_6; @FXML ImageView id_2_6; @FXML ImageView id_3_6; @FXML ImageView id_4_6; @FXML ImageView id_5_6; @FXML ImageView id_6_6; @FXML ImageView id_7_6; @FXML ImageView id_8_6; @FXML ImageView id_9_6; @FXML ImageView id_10_6; @FXML ImageView id_11_6; @FXML ImageView id_12_6;
    @FXML ImageView id_0_7; @FXML ImageView id_1_7; @FXML ImageView id_2_7; @FXML ImageView id_3_7; @FXML ImageView id_4_7; @FXML ImageView id_5_7; @FXML ImageView id_6_7; @FXML ImageView id_7_7; @FXML ImageView id_8_7; @FXML ImageView id_9_7; @FXML ImageView id_10_7; @FXML ImageView id_11_7; @FXML ImageView id_12_7;
    @FXML ImageView id_0_8; @FXML ImageView id_1_8; @FXML ImageView id_2_8; @FXML ImageView id_3_8; @FXML ImageView id_4_8; @FXML ImageView id_5_8; @FXML ImageView id_6_8; @FXML ImageView id_7_8; @FXML ImageView id_8_8; @FXML ImageView id_9_8; @FXML ImageView id_10_8; @FXML ImageView id_11_8; @FXML ImageView id_12_8;
    @FXML ImageView id_0_9; @FXML ImageView id_1_9; @FXML ImageView id_2_9; @FXML ImageView id_3_9; @FXML ImageView id_4_9; @FXML ImageView id_5_9; @FXML ImageView id_6_9; @FXML ImageView id_7_9; @FXML ImageView id_8_9; @FXML ImageView id_9_9; @FXML ImageView id_10_9; @FXML ImageView id_11_9; @FXML ImageView id_12_9;
    @FXML ImageView id_0_10; @FXML ImageView id_1_10; @FXML ImageView id_2_10; @FXML ImageView id_3_10; @FXML ImageView id_4_10; @FXML ImageView id_5_10; @FXML ImageView id_6_10; @FXML ImageView id_7_10; @FXML ImageView id_8_10; @FXML ImageView id_9_10; @FXML ImageView id_10_10; @FXML ImageView id_11_10; @FXML ImageView id_12_10;
    @FXML
    GridPane gridPane;

    @FXML
    Label puan;

    ArrayList<ArrayList<ImageView>> drawMap = new ArrayList<>();
    Dusman dusman1 = null;
    Dusman dusman2 = null;
    Oyuncu oyuncu = null;
    Gargamel gargamel;
    Azman azman;
    Lokasyon cikis = new Lokasyon(12,7);
    @FXML
    public  void ayarla() throws FileNotFoundException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            File file = new File("src/drawings/GargamelYol.png");
                            GargamelYol.setImage(new Image(file.toURI().toString()));
                            file = new File("src/drawings/AzmanYol.png");
                            AzmanYol.setImage(new Image(file.toURI().toString()));
                            file = new File("src/drawings/walls.jpg");
                            ArrayList<ImageView> list = new ArrayList<>();
                            list.add(id_0_0); list.add(id_1_0); list.add(id_2_0); list.add(id_3_0); list.add(id_4_0); list.add(id_5_0); list.add(id_6_0); list.add(id_7_0); list.add(id_8_0); list.add(id_9_0); list.add(id_10_0); list.add(id_11_0); list.add(id_12_0);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_1); list.add(id_1_1); list.add(id_2_1); list.add(id_3_1); list.add(id_4_1); list.add(id_5_1); list.add(id_6_1); list.add(id_7_1); list.add(id_8_1); list.add(id_9_1); list.add(id_10_1); list.add(id_11_1); list.add(id_12_1);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_2); list.add(id_1_2); list.add(id_2_2); list.add(id_3_2); list.add(id_4_2); list.add(id_5_2); list.add(id_6_2); list.add(id_7_2); list.add(id_8_2); list.add(id_9_2); list.add(id_10_2); list.add(id_11_2); list.add(id_12_2);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_3); list.add(id_1_3); list.add(id_2_3); list.add(id_3_3); list.add(id_4_3); list.add(id_5_3); list.add(id_6_3); list.add(id_7_3); list.add(id_8_3); list.add(id_9_3); list.add(id_10_3); list.add(id_11_3); list.add(id_12_3);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_4); list.add(id_1_4); list.add(id_2_4); list.add(id_3_4); list.add(id_4_4); list.add(id_5_4); list.add(id_6_4); list.add(id_7_4); list.add(id_8_4); list.add(id_9_4); list.add(id_10_4); list.add(id_11_4); list.add(id_12_4);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_5); list.add(id_1_5); list.add(id_2_5); list.add(id_3_5); list.add(id_4_5); list.add(id_5_5); list.add(id_6_5); list.add(id_7_5); list.add(id_8_5); list.add(id_9_5); list.add(id_10_5); list.add(id_11_5); list.add(id_12_5);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_6); list.add(id_1_6); list.add(id_2_6); list.add(id_3_6); list.add(id_4_6); list.add(id_5_6); list.add(id_6_6); list.add(id_7_6); list.add(id_8_6); list.add(id_9_6); list.add(id_10_6); list.add(id_11_6); list.add(id_12_6);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_7); list.add(id_1_7); list.add(id_2_7); list.add(id_3_7); list.add(id_4_7); list.add(id_5_7); list.add(id_6_7); list.add(id_7_7); list.add(id_8_7); list.add(id_9_7); list.add(id_10_7); list.add(id_11_7); list.add(id_12_7);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_8); list.add(id_1_8); list.add(id_2_8); list.add(id_3_8); list.add(id_4_8); list.add(id_5_8); list.add(id_6_8); list.add(id_7_8); list.add(id_8_8); list.add(id_9_8); list.add(id_10_8); list.add(id_11_8); list.add(id_12_8);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_9); list.add(id_1_9); list.add(id_2_9); list.add(id_3_9); list.add(id_4_9); list.add(id_5_9); list.add(id_6_9); list.add(id_7_9); list.add(id_8_9); list.add(id_9_9); list.add(id_10_9); list.add(id_11_9); list.add(id_12_9);
                            drawMap.add(list);
                            list = new ArrayList<>();
                            list.add(id_0_10); list.add(id_1_10); list.add(id_2_10); list.add(id_3_10); list.add(id_4_10); list.add(id_5_10); list.add(id_6_10); list.add(id_7_10); list.add(id_8_10); list.add(id_9_10); list.add(id_10_10); list.add(id_11_10); list.add(id_12_10);
                            drawMap.add(list);

                            File duvar = new File("src/drawings/walls.jpg");
                            Image duvarImage = new Image(duvar.toURI().toString());

                            File sirineImage = new File("src/drawings/Sirine.jpg");
                            drawMap.get(7).get(12).setImage(new Image(sirineImage.toURI().toString()));
                            drawMap.get(0).get(0).setImage(duvarImage); drawMap.get(0).get(1).setImage(duvarImage); drawMap.get(0).get(2).setImage(duvarImage); drawMap.get(0).get(4).setImage(duvarImage); drawMap.get(0).get(5).setImage(duvarImage); drawMap.get(0).get(6).setImage(duvarImage); drawMap.get(0).get(7).setImage(duvarImage); drawMap.get(0).get(8).setImage(duvarImage); drawMap.get(0).get(9).setImage(duvarImage); drawMap.get(0).get(11).setImage(duvarImage); drawMap.get(0).get(12).setImage(duvarImage);

                            drawMap.get(1).get(0).setImage(duvarImage); drawMap.get(1).get(5).setImage(duvarImage); drawMap.get(1).get(12).setImage(duvarImage);

                            drawMap.get(2).get(0).setImage(duvarImage); drawMap.get(2).get(2).setImage(duvarImage); drawMap.get(2).get(9).setImage(duvarImage); drawMap.get(2).get(10).setImage(duvarImage); drawMap.get(2).get(12).setImage(duvarImage);

                            drawMap.get(3).get(0).setImage(duvarImage); drawMap.get(3).get(5).setImage(duvarImage); drawMap.get(3).get(7).setImage(duvarImage); drawMap.get(3).get(10).setImage(duvarImage);drawMap.get(3).get(12).setImage(duvarImage);

                            drawMap.get(4).get(0).setImage(duvarImage); drawMap.get(4).get(2).setImage(duvarImage); drawMap.get(4).get(4).setImage(duvarImage); drawMap.get(4).get(5).setImage(duvarImage); drawMap.get(4).get(7).setImage(duvarImage); drawMap.get(4).get(9).setImage(duvarImage); drawMap.get(4).get(10).setImage(duvarImage); drawMap.get(4).get(12).setImage(duvarImage);

                            drawMap.get(5).get(2).setImage(duvarImage); drawMap.get(5).get(7).setImage(duvarImage); drawMap.get(5).get(9).setImage(duvarImage); drawMap.get(5).get(12).setImage(duvarImage);

                            drawMap.get(6).get(0).setImage(duvarImage); drawMap.get(6).get(2).setImage(duvarImage); drawMap.get(6).get(3).setImage(duvarImage); drawMap.get(6).get(7).setImage(duvarImage); drawMap.get(6).get(12).setImage(duvarImage);

                            drawMap.get(7).get(0).setImage(duvarImage); drawMap.get(7).get(2).setImage(duvarImage);

                            drawMap.get(8).get(0).setImage(duvarImage); drawMap.get(8).get(2).setImage(duvarImage); drawMap.get(8).get(4).setImage(duvarImage); drawMap.get(8).get(5).setImage(duvarImage); drawMap.get(8).get(6).setImage(duvarImage); drawMap.get(8).get(7).setImage(duvarImage); drawMap.get(8).get(8).setImage(duvarImage); drawMap.get(8).get(12).setImage(duvarImage);

                            drawMap.get(9).get(0).setImage(duvarImage); drawMap.get(9).get(12).setImage(duvarImage);

                            drawMap.get(10).get(0).setImage(duvarImage); drawMap.get(10).get(1).setImage(duvarImage); drawMap.get(10).get(2).setImage(duvarImage); drawMap.get(10).get(4).setImage(duvarImage); drawMap.get(10).get(5).setImage(duvarImage); drawMap.get(10).get(6).setImage(duvarImage); drawMap.get(10).get(7).setImage(duvarImage); drawMap.get(10).get(8).setImage(duvarImage); drawMap.get(10).get(9).setImage(duvarImage); drawMap.get(10).get(10).setImage(duvarImage); drawMap.get(10).get(11).setImage(duvarImage); drawMap.get(10).get(12).setImage(duvarImage);

                            gridPane.requestFocus();

                            File dosya = new File("src/harita.txt");
                            String[] dusmanInfo = null;
                            String dostInfo = null;
                            try {
                                Scanner scanner = new Scanner(dosya);
                                dusmanInfo = scanner.nextLine().split(" ");

                                dostInfo = scanner.nextLine();

                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }

                            Lokasyon a = new Lokasyon(3,0);
                            Lokasyon b = new Lokasyon(10,0);
                            Lokasyon c = new Lokasyon(0,5);
                            Lokasyon d = new Lokasyon(3,10);
                            if(dusmanInfo!=null){
                                if(dusmanInfo.length==2){
                                    if(dusmanInfo[0].equals("Gargamel")){
                                        if(dusmanInfo[1].equals("A"))
                                            dusman1 = new Gargamel(a);

                                        else if(dusmanInfo[1].equals("B"))
                                            dusman1 = new Gargamel(b);

                                        else if(dusmanInfo[1].equals("C"))
                                            dusman1 = new Gargamel(c);

                                        else if(dusmanInfo[1].equals("D"))
                                            dusman1 = new Gargamel(d);
                                    }

                                    else if(dusmanInfo[0].equals("Azman")){
                                        if(dusmanInfo[1].equals("A"))
                                            dusman1 = new Azman(a);

                                        else if(dusmanInfo[1].equals("B"))
                                            dusman1 = new Azman(b);

                                        else if(dusmanInfo[1].equals("C"))
                                            dusman1 = new Azman(c);

                                        else if(dusmanInfo[1].equals("D"))
                                            dusman1 = new Azman(d);
                                    }
                                }

                                else
                                {
                                    if(dusmanInfo[0].equals("Gargamel")){
                                        if(dusmanInfo[1].equals("A"))
                                            dusman1 = new Gargamel(a);

                                        else if(dusmanInfo[1].equals("B"))
                                            dusman1 = new Gargamel(b);

                                        else if(dusmanInfo[1].equals("C"))
                                            dusman1 = new Gargamel(c);

                                        else if(dusmanInfo[1].equals("D"))
                                            dusman1 = new Gargamel(d);

                                        if(dusmanInfo[3].equals("A"))
                                            dusman2 = new Azman(a);

                                        else if(dusmanInfo[3].equals("B"))
                                            dusman2 = new Azman(b);

                                        else if(dusmanInfo[3].equals("C"))
                                            dusman2 = new Azman(c);

                                        else if(dusmanInfo[3].equals("D"))
                                            dusman2 = new Azman(d);
                                    }

                                    else if(dusmanInfo[0].equals("Azman")){
                                        if(dusmanInfo[1].equals("A"))
                                            dusman1 = new Azman(a);

                                        else if(dusmanInfo[1].equals("B"))
                                            dusman1 = new Azman(b);

                                        else if(dusmanInfo[1].equals("C"))
                                            dusman1 = new Azman(c);

                                        else if(dusmanInfo[1].equals("D"))
                                            dusman1 = new Azman(d);

                                        if(dusmanInfo[3].equals("A"))
                                            dusman2 = new Gargamel(a);

                                        else if(dusmanInfo[3].equals("B"))
                                            dusman2 = new Gargamel(b);

                                        else if(dusmanInfo[3].equals("C"))
                                            dusman2 = new Gargamel(c);

                                        else if(dusmanInfo[3].equals("D"))
                                            dusman2 = new Gargamel(d);
                                    }
                                }
                            }

                            if(dostInfo!=null){
                                if(dostInfo.equals("Gozluklu"))
                                    oyuncu = new Gozluklu();

                                else if(dostInfo.equals("Tembel"))
                                    oyuncu = new Tembel();
                            }

                            if(oyuncu!=null){
                                int x = oyuncu.oyuncuKonum().getX();
                                int y = oyuncu.oyuncuKonum().getY();
                                drawMap.get(y).get(x).setImage(oyuncu.getOyuncuImage());

                            }

                             if(dusman1!=null){
                                int x = dusman1.getDusmanKonum().getX();
                                int y = dusman1.getDusmanKonum().getY();

                                 drawMap.get(y).get(x).setImage(dusman1.getDusmanImage());
                             }

                             if(dusman2!=null){
                                 int x = dusman2.getDusmanKonum().getX();
                                 int y = dusman2.getDusmanKonum().getY();

                                 drawMap.get(y).get(x).setImage(dusman2.getDusmanImage());
                             }

                            if(dusman1.getID().equals("Gargamel")){
                                gargamel = (Gargamel) dusman1;
                            }
                            else if (dusman1.getID().equals("Azman")){
                                azman = (Azman) dusman1;
                            }

                            if(dusman2!=null){
                                if(dusman2.getID().equals("Gargamel")){
                                    gargamel = (Gargamel) dusman2;
                                }
                                else if (dusman2.getID().equals("Azman")){
                                    azman = (Azman) dusman2;
                                }
                            }

                            puan.setText("Oyuncu Puanı: "+oyuncu.PuaniGoster());
                        }
                    });
                }catch (InterruptedException e){
                    System.out.println("başaramadık usta");
                }
            }
        };

        new Thread(runnable).start();
    }

    boolean gozlukluFlag = false;
    @FXML
    public void oyun(KeyEvent keyEvent){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        File wipeFile = new File("src/drawings/wipe.png");
                        Image wipeImg = new Image(wipeFile.toURI().toString());

                        drawMap.get(0).get(3).setImage(wipeImg); drawMap.get(0).get(10).setImage(wipeImg); drawMap.get(1).get(1).setImage(wipeImg); drawMap.get(1).get(2).setImage(wipeImg);drawMap.get(1).get(3).setImage(wipeImg);drawMap.get(1).get(4).setImage(wipeImg); drawMap.get(1).get(6).setImage(wipeImg);  drawMap.get(1).get(7).setImage(wipeImg); drawMap.get(1).get(8).setImage(wipeImg); drawMap.get(1).get(9).setImage(wipeImg); drawMap.get(1).get(10).setImage(wipeImg); drawMap.get(1).get(10).setImage(wipeImg); drawMap.get(2).get(1).setImage(wipeImg); drawMap.get(2).get(3).setImage(wipeImg); drawMap.get(2).get(4).setImage(wipeImg); drawMap.get(2).get(5).setImage(wipeImg); drawMap.get(2).get(6).setImage(wipeImg);
                        drawMap.get(2).get(7).setImage(wipeImg); drawMap.get(2).get(8).setImage(wipeImg); drawMap.get(2).get(11).setImage(wipeImg); drawMap.get(3).get(1).setImage(wipeImg); drawMap.get(3).get(2).setImage(wipeImg); drawMap.get(3).get(3).setImage(wipeImg);drawMap.get(3).get(4).setImage(wipeImg); drawMap.get(3).get(6).setImage(wipeImg); drawMap.get(3).get(8).setImage(wipeImg); drawMap.get(3).get(9).setImage(wipeImg); drawMap.get(3).get(11).setImage(wipeImg); drawMap.get(4).get(1).setImage(wipeImg); drawMap.get(4).get(3).setImage(wipeImg); drawMap.get(4).get(6).setImage(wipeImg); drawMap.get(4).get(8).setImage(wipeImg); drawMap.get(4).get(11).setImage(wipeImg); drawMap.get(5).get(0).setImage(wipeImg);
                        drawMap.get(5).get(1).setImage(wipeImg); drawMap.get(5).get(3).setImage(wipeImg); drawMap.get(5).get(4).setImage(wipeImg); drawMap.get(5).get(5).setImage(wipeImg); drawMap.get(5).get(6).setImage(wipeImg); drawMap.get(5).get(8).setImage(wipeImg); drawMap.get(5).get(10).setImage(wipeImg); drawMap.get(5).get(11).setImage(wipeImg); drawMap.get(6).get(1).setImage(wipeImg); drawMap.get(6).get(4).setImage(wipeImg); drawMap.get(6).get(5).setImage(wipeImg); drawMap.get(6).get(6).setImage(wipeImg); drawMap.get(6).get(8).setImage(wipeImg); drawMap.get(6).get(9).setImage(wipeImg); drawMap.get(6).get(10).setImage(wipeImg); drawMap.get(6).get(11).setImage(wipeImg); drawMap.get(7).get(1).setImage(wipeImg);
                        drawMap.get(7).get(3).setImage(wipeImg); drawMap.get(7).get(4).setImage(wipeImg); drawMap.get(7).get(5).setImage(wipeImg); drawMap.get(7).get(6).setImage(wipeImg); drawMap.get(7).get(7).setImage(wipeImg); drawMap.get(7).get(8).setImage(wipeImg); drawMap.get(7).get(9).setImage(wipeImg); drawMap.get(7).get(10).setImage(wipeImg); drawMap.get(7).get(11).setImage(wipeImg); drawMap.get(8).get(1).setImage(wipeImg); drawMap.get(8).get(3).setImage(wipeImg); drawMap.get(8).get(9).setImage(wipeImg); drawMap.get(8).get(10).setImage(wipeImg); drawMap.get(8).get(11).setImage(wipeImg);
                        for(int i=1;i<12;i++)
                            drawMap.get(9).get(i).setImage(wipeImg);

                        drawMap.get(10).get(3).setImage(wipeImg);
                        
                       if(oyuncu.getoyuncuID().equals("Gozluklu")){

                            boolean didMove = oyuncu.move(keyEvent.getCode().toString());
                            if(!gozlukluFlag && didMove){
                                gozlukluFlag = true;
                            }

                            else if(gozlukluFlag && didMove){
                                gozlukluFlag = false;

                                if(gargamel!=null){
                                    ArrayList<Lokasyon> ciz = gargamel.move(oyuncu.oyuncuKonum());

                                    if(ciz!=null){
                                        File file = new File("src/drawings/GargamelYol.png");
                                        Image img = new Image(file.toURI().toString());
                                        for(Lokasyon lokasyon : ciz){
                                            if(azman!=null){
                                                if(!drawMap.get(lokasyon.getY()).get(lokasyon.getX()).getImage().equals(azman.getDusmanImage()))
                                                    drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                            }else{
                                                drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                            }
                                        }
                                    }

                                    else if(ciz==null){
                                        oyuncu.PuanHesapa(gargamel);
                                        gargamel.setInitialLokasyon();
                                    }

                                    drawMap.get(gargamel.getDusmanKonum().getY()).get(gargamel.getDusmanKonum().getX()).setImage(gargamel.getDusmanImage());
                                }

                                if(azman!=null){
                                    ArrayList<Lokasyon> ciz = azman.move(oyuncu.oyuncuKonum());
                                    if(ciz!= null){
                                        File file = new File("src/drawings/AzmanYol.png");
                                        Image img = new Image(file.toURI().toString());
                                        for(Lokasyon lokasyon : ciz){
                                            if(gargamel!=null){
                                                if(!drawMap.get(lokasyon.getY()).get(lokasyon.getX()).getImage().equals(gargamel.getDusmanImage()))
                                                    drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                            }
                                            else{
                                                drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                            }
                                        }

                                    }

                                    else if(ciz == null){
                                        oyuncu.PuanHesapa(azman);
                                        azman.setInitialLokasyon();
                                    }
                                    drawMap.get(azman.getDusmanKonum().getY()).get(azman.getDusmanKonum().getX()).setImage(azman.getDusmanImage());
                                }
                            }

                           int x = oyuncu.oyuncuKonum().getX();
                           int y = oyuncu.oyuncuKonum().getY();

                           drawMap.get(y).get(x).setImage(oyuncu.getOyuncuImage());
                            puan.setText("Gözlüklü Şirin Puanı: "+oyuncu.PuaniGoster());
                       }

                       else if(oyuncu.getoyuncuID().equals("Tembel")){
                           boolean didMove = oyuncu.move(keyEvent.getCode().toString());


                           if(didMove){
                               if(gargamel!=null){
                                  ArrayList<Lokasyon> ciz = gargamel.move(oyuncu.oyuncuKonum());

                                  if(ciz!=null){
                                      File file = new File("src/drawings/GargamelYol.png");
                                      Image img = new Image(file.toURI().toString());
                                      for(Lokasyon lokasyon:ciz){
                                          if(azman!=null){
                                              if(!drawMap.get(lokasyon.getY()).get(lokasyon.getX()).getImage().equals(azman.getDusmanImage()))
                                                  drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                          }else{
                                              drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                          }
                                      }
                                  }
                                  
                                  else if(ciz==null){
                                      oyuncu.PuanHesapa(gargamel);
                                      gargamel.setInitialLokasyon();
                                  }
                                  
                                  drawMap.get(gargamel.getDusmanKonum().getY()).get(gargamel.getDusmanKonum().getX()).setImage(gargamel.getDusmanImage());
                               }
                               
                               if(azman!=null){
                                   ArrayList<Lokasyon> ciz = azman.move(oyuncu.oyuncuKonum());

                                   if(ciz!=null){
                                       File file = new File("src/drawings/AzmanYol.png");
                                       Image img = new Image(file.toURI().toString());
                                       for(Lokasyon lokasyon:ciz){
                                           if(gargamel!=null){
                                               if(!drawMap.get(lokasyon.getY()).get(lokasyon.getX()).getImage().equals(gargamel.getDusmanImage()))
                                                   drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                           }else{
                                               drawMap.get(lokasyon.getY()).get(lokasyon.getX()).setImage(img);
                                           }
                                       }
                                   }

                                   else if(ciz==null){
                                       oyuncu.PuanHesapa(azman);
                                       azman.setInitialLokasyon();
                                   }

                                   drawMap.get(azman.getDusmanKonum().getY()).get(azman.getDusmanKonum().getX()).setImage(azman.getDusmanImage());
                               }

                           }
                           int x = oyuncu.oyuncuKonum().getX();
                           int y = oyuncu.oyuncuKonum().getY();

                           drawMap.get(y).get(x).setImage(oyuncu.getOyuncuImage());
                           puan.setText("Tembel Şirin Puanı: "+oyuncu.PuaniGoster());
                       }
                        System.out.println(oyuncu.oyuncuKonum().getX()+" "+oyuncu.oyuncuKonum().getY());
                       if(oyuncu.oyuncuKonum().equals(cikis)){
                           try {
                               System.out.println("here");
                               puan.setText("TEBRİKLER, ŞİRİNE'YE ULAŞTINIZ!!!");
                               Thread.sleep(5000);
                               Platform.exit();
                           }catch (InterruptedException e){
                               System.out.println("Kazanma koşulu interrupted");
                           }
                        }

                        if(oyuncu.PuaniGoster()<=0){
                            try {
                                Thread.sleep(5000);
                                puan.setText("KAYBETTİNİZ!!!");
                                Platform.exit();
                            } catch (InterruptedException e) {
                                System.out.println("Kaybetme koşulu interrupted");
                            }
                        }
                    }
                });
            }
        };

        new Thread(runnable).start();
    }

    public void initialize(){
        try{
            ayarla();
        }catch (FileNotFoundException e){

        }


    }
}
