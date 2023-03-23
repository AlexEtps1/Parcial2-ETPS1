package sv.edu.utec.parcial22511482019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Empleados> listaempleados;
    ListView lv1;
    Integer[]ImgEempleados={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaempleados = new ArrayList<Empleados>();

        listaempleados.add(new Empleados("Alexander Perriot", "CEO", "Insures S.O."));
        listaempleados.add(new Empleados("Carlos Lopez", "Asistente", "Hospital Blue"));
        listaempleados.add(new Empleados("Sara Bonz", "Directora de Marketing", "Electricals Parts Itd"));
        listaempleados.add(new Empleados("Liliana Clarence", "Diseñadora de Producto", "Creative App"));
        listaempleados.add(new Empleados("Benito Peralta", "Supervisor de Ventas", "Neumaticos Press"));
        listaempleados.add(new Empleados("Juan Jaramillo", "CEO", "Insures S.O."));
        listaempleados.add(new Empleados("Christian Steps", "CTO", "Insures S.O."));
        listaempleados.add(new Empleados("Alexa Giraldo", "Lead Programmer", "Insures S.O."));
        listaempleados.add(new Empleados("Linda Murillo", "Directora de Marketing", "Insures S.O."));
        listaempleados.add(new Empleados("Lizeth Astrada", "CEO", "Insures S.O."));
    }
}