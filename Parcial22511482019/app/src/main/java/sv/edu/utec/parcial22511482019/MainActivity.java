package sv.edu.utec.parcial22511482019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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
    };
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
        listaempleados.add(new Empleados("Juan Jaramillo", "CEO", "Banco Nacional"));
        listaempleados.add(new Empleados("Christian Steps", "CTO", "Cooperativa Verde"));
        listaempleados.add(new Empleados("Alexa Giraldo", "Lead Programmer", "Frutisofy"));
        listaempleados.add(new Empleados("Linda Murillo", "Directora de Marketing", "Seguros Boliver"));
        listaempleados.add(new Empleados("Lizeth Astrada", "CEO", "Concesionario Motolox"));
    }

    class AdapatdorEmpleados extends ArrayAdapter<Empleados>{
        AppCompatActivity appCompatActivity;

        AdapatdorEmpleados(AppCompatActivity context){
            super(context, R.layout.empleados, listaempleados);
            appCompatActivity=context;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater= appCompatActivity.getLayoutInflater();
            View item= inflater.inflate(R.layout.empleados, null);

            TextView tv1= item.findViewById(R.id.tvNombre);
            tv1.setText(listaempleados.get(position).getNombre());

            TextView tv2= item.findViewById(R.id.tvCargo);
            tv2.setText(listaempleados.get(position).getCargo());

            TextView tv3= item.findViewById(R.id.tvCompania);
            tv3.setText(listaempleados.get(position).getCompania());

            ImageView img1= item.findViewById(R.id.imvFoto);
            img1.setImageResource(ImgEempleados[position]);

            return item;
        }
    }
}