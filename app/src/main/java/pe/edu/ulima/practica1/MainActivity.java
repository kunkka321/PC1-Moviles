package pe.edu.ulima.practica1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Button butA;
    Button butB;
    Button butC;
    Button butD;
    Button butE;
    Button butF;
    Button butG;
    Button butH;
    Button butI;

    String cad1 = "";
    String cad2 = "";
    String cad3 = "";
    String cad4 = "";
    String cad5 = "";
    String cad6 = "";
    String cad7 = "";
    String cad8 = "";
    String cad9 = "";


    TextView cadenita;


    Boolean o;
    Boolean x;
    String turno = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        butA = (Button) findViewById(R.id.a);
        butB = (Button) findViewById(R.id.b);
        butC = (Button) findViewById(R.id.c);
        butD = (Button) findViewById(R.id.d);
        butE = (Button) findViewById(R.id.e);
        butF = (Button) findViewById(R.id.f);
        butG = (Button) findViewById(R.id.g);
        butH = (Button) findViewById(R.id.h);
        butI = (Button) findViewById(R.id.i);
        cadenita = (TextView) findViewById(R.id.cadena);

    }


    public void a(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butA.setText("o");
            cad1 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);
        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad1.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butA.setText("o");
                cad1 = "o;";

                if ((cad1.equals("o")&&cad2.equals("o") && cad3.equals("o")) || (cad1.equals("o")&&cad4.equals("o") && cad7.equals("o")) || (cad1.equals("o")&&cad5.equals("o") && cad9.equals("o"))) {

                    cadenita.setText("Gano el jugador O");
                } else {
                    turno = "le toca al jugador x";
                    cadenita.setText(turno);
                }


            } else if (turno.equals("le toca al jugador x")) {
                butA.setText("x");
                cad1 = "x";
                if ((cad2.equals("x") && cad3.equals("x")) || (cad4.equals("x") && cad7.equals("x")) || (cad5.equals("x") && cad9.equals("x"))) {

                    cadenita.setText("Gano el jugador X");
                } else {
                    turno = "le toca al jugador o";
                    cadenita.setText(turno);
                }
            }

        }

    }

    public void b(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butB.setText("o");
            cad2 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);
        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad2.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butB.setText("o");
                cad2 = "o;";
                turno = "le toca al jugador x";
                cadenita.setText(turno);
            } else if (turno.equals("le toca al jugador x")) {
                butB.setText("x");
                cad2 = "x;";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }

    public void c(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butC.setText("o");
            cad3 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);

        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad3.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butC.setText("o");
                cad3 = "o;";
                turno = "le toca al jugador x";
                cadenita.setText(turno);
            } else if (turno.equals("le toca al jugador x")) {
                butC.setText("x");
                cad3 = "x;";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }

    public void d(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butD.setText("o");
            cad4 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);

        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad4.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butD.setText("o");
                cad4 = "o;";
                turno = "le toca al jugador x";
                cadenita.setText(turno);
            } else if (turno.equals("le toca al jugador x")) {
                butD.setText("x");
                cad4 = "x;";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }


    public void e(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butE.setText("o");
            cad5 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);

        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad5.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butE.setText("o");
                cad5 = "o;";
                turno = "le toca al jugador x";
                cadenita.setText(turno);
            } else if (turno.equals("le toca al jugador x")) {
                butE.setText("x");
                cad5 = "x;";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }

    public void f(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butF.setText("o");
            cad6 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);
        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {


            if (!cad6.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butF.setText("o");
                cad6 = "o;";
                turno = "le toca al jugador x";
                cadenita.setText(turno);
            } else if (turno.equals("le toca al jugador x")) {
                butF.setText("x");
                cad6 = "x;";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }

    public void g(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butG.setText("o");
            cad7 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);

        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad7.equals("")) {


            } else if (turno.equals("le toca al jugador o")) {
                butG.setText("o");
                cad7 = "o;";
                turno = "le toca al jugador x";
                cadenita.setText(turno);

            } else if (turno.equals("le toca al jugador x")) {
                butG.setText("x");
                cad7 = "x;";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }


    public void h(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butH.setText("o");
            cad8 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);

        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad8.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butH.setText("o");
                cad8 = "o";
                turno = "le toca al jugador x";
                cadenita.setText(turno);
            } else if (turno.equals("le toca al jugador x")) {
                butH.setText("x");
                cad8 = "x";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }

    public void i(View ver) {

        if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == true) {


            turno = "le toca al jugador o";
            cadenita.setText(turno);
            butI.setText("o");
            cad9 = "o";
            turno = "le toca al jugador x";
            cadenita.setText(turno);

        } else if (Turno(cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9) == false) {

            if (!cad9.equals("")) {

            } else if (turno.equals("le toca al jugador o")) {
                butI.setText("o");
                cad9 = "o";
                turno = "le toca al jugador x";
                cadenita.setText(turno);
            } else if (turno.equals("le toca al jugador x")) {
                butI.setText("x");
                cad9 = "x";
                turno = "le toca al jugador o";
                cadenita.setText(turno);
            }
        }

    }

    public boolean Turno(String cad1, String cad2, String cad3, String cad4, String cad5, String cad6, String cad7, String cad8, String cad9) {
        if (cad1.equals("") && cad2.equals("") && cad3.equals("") && cad4.equals("") && cad5.equals("") &&
                cad6.equals("") && cad7.equals("") && cad8.equals("") && cad9.equals("")) {

            turno = "le toca al jugador o";
            return true;
        } else {

            return false;
        }
    }





}
