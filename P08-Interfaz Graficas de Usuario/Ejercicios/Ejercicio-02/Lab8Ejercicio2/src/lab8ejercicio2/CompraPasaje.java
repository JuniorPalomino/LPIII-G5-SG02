package lab8ejercicio2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CompraPasaje extends JFrame {

    private final JLabel datos[] = new JLabel[4];
    private final JLabel titulos[] = new JLabel[6];
    private final JLabel etiquetaDatosViaje[] = new JLabel[8];
    private final JTextField textos[] = new JTextField[4];
    private final JButton botones[] = new JButton[2];
    private final JPanel panelDatosViaje;
    private final JCheckBox verificacion[] = new JCheckBox[3];
    private final JRadioButton botonOpciones[] = new JRadioButton[2];
    private final JComboBox origen;
    private final JComboBox destino;
    private final JList<String> lista;
    private final JPanel panel;
    private String servicioOpc, piso, lugarOrigen, lugarDestino,calidad;
    private ButtonGroup grupoOpciones;
    private static final String[] etiquetas = {"INGRESO DE DATOS", "SERVICIOS OPCIONALES", "SELECCIONE SU PISO","ORIGEN","DESTINO","SELECCIONE LA CALIDAD DEL SERVICIO"};
    /*etiqueta datos, etiqueta servicio opcional, eqtiqueta piso, etiqueta origen y destino, etiqueta calidad*/
    private static final String[] ciudades = {"Arequipa", "Lima", "Ayacucho", "Cusco", "Moquegua", "Tacna", "Piura", "Tumbes", "Cajamarca", "Loreto"};
    private static final String[] calidades = {"Economico", "Estandar", "VIP"};
    private static final String[] datosDelPasajero = {"Pasajero: ", "DNI: ","Fecha de viaje: ", "Servicios Adicionales: ","Piso: ","Origen: ","Destino: ","Calidad: "};
    public CompraPasaje() {
        super("Ventana prueba");
        String[] nombreDatos = {"Nombres", "Apellidos", "DNI", "Fecha de viaje"};

        panel = new JPanel();
        panel.setLayout(null);
        for(int i=0;i<titulos.length;i++)
        {
            titulos[i]=new JLabel(etiquetas[i]);
        }
        titulos[0].setBounds(15, 20, 200, 25);
        
        titulos[1].setBounds(15, 230, 200, 25);
        titulos[2].setBounds(15, 300, 200, 25);
        titulos[3].setBounds(50, 400, 200, 25);
        titulos[4].setBounds(200, 400, 200, 25);
        titulos[5].setBounds(15, 500, 300, 25);
        for(int i=0;i<titulos.length;i++)
        {
            panel.add(titulos[i]);
        }
        verificacion[0] = new JCheckBox("Audifonos");
        verificacion[1] = new JCheckBox("Manta");
        verificacion[2] = new JCheckBox("Revista");

        botonOpciones[0] = new JRadioButton("1er Piso", false);
        botonOpciones[1] = new JRadioButton("2do Piso", false);

        origen = new JComboBox(ciudades);
        origen.setMaximumRowCount(5);
        destino = new JComboBox(ciudades);
        destino.setMaximumRowCount(5);
        lista = new JList<String>(calidades);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        ManejadorLista manejLista = new ManejadorLista();
        ManejadorBoton manejBoton =new ManejadorBoton();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new JLabel(nombreDatos[i]);
            textos[i] = new JTextField(30);
            datos[i].setBounds(15, (i + 1) * 50, 100, 25);
            textos[i].setBounds(150, (i + 1) * 50, 150, 25);
            datos[i].setHorizontalAlignment(SwingConstants.CENTER);
            grupoOpciones = new ButtonGroup();

            if (i < verificacion.length) {
                verificacion[i].setBounds(100 * (i), 250, 100, 25);
                verificacion[i].addItemListener(manejador);
                panel.add(verificacion[i]);
            }

            if (i < botonOpciones.length) {
                botonOpciones[i].setBounds(100 * (i), 350, 100, 25);

                botonOpciones[i].addItemListener(manejador);
                panel.add(botonOpciones[i]);

            }

            panel.add(datos[i]);
            panel.add(textos[i]);

        }
        grupoOpciones.add(botonOpciones[0]);
        grupoOpciones.add(botonOpciones[1]);

        origen.addItemListener(manejador);
        destino.addItemListener(manejador);
        origen.setBounds(50, 450, 100, 25);
        destino.setBounds(200, 450, 100, 25);
        lista.setBounds(100, 550, 100, 60);
        lista.addListSelectionListener(manejLista);
        panel.add(origen);
        panel.add(destino);
        panel.add(lista);

        botones[0] = new JButton("Limpiar");
        botones[1] = new JButton("Continuar");
        
        for (int i = 0; i < botones.length; i++) {
            botones[i].setBounds((i+1)*120, 650, 100, 25);
            botones[i].addActionListener(manejBoton);
            panel.add(botones[i]);
        }

        add(panel);
        
        panelDatosViaje=new JPanel();
        panelDatosViaje.setLayout(null);
        JLabel aux=new JLabel("DATOS DEL PASAJERO");
        aux.setHorizontalAlignment(SwingConstants.CENTER);
        aux.setBounds(50, 20, 300, 25);
        panelDatosViaje.add(aux);
        for(int i=0;i<etiquetaDatosViaje.length;i++)
        {
            etiquetaDatosViaje[i]=new JLabel(datosDelPasajero[i]);
            panelDatosViaje.add(etiquetaDatosViaje[i]);
            etiquetaDatosViaje[i].setBounds(50, (i + 1) * 80, 300, 25);
            etiquetaDatosViaje[i].setHorizontalAlignment(SwingConstants.CENTER);
        }
        
    }

    private class ManejadorCheckBox implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent evento) {
            for (JCheckBox jch : verificacion) {
                if (jch.isSelected()) {
                    servicioOpc = jch.getText();
                    
                    etiquetaDatosViaje[3].setText(datosDelPasajero[3]+jch.getText());
                }
            }
            for (JRadioButton jrb : botonOpciones) {
                if (jrb.isSelected()) {
                    piso = jrb.getText();
                    
                    etiquetaDatosViaje[4].setText(datosDelPasajero[4]+jrb.getText());
                    
                }
            }

        }

    }

    private class ManejadorLista implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            
            etiquetaDatosViaje[7].setText(datosDelPasajero[7]+lista.getSelectedValue());
        }

    }

    private class ManejadorBoton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == botones[0]) {
                    for (JTextField jtf : textos) {
                        jtf.setText("");
                    }
                } else if (e.getSource() == botones[1]) {
                    panel.setVisible(false);
                    
                    etiquetaDatosViaje[0].setText(datosDelPasajero[0]+textos[1].getText()+","+textos[0].getText());
                    etiquetaDatosViaje[1].setText(datosDelPasajero[1]+textos[2].getText());
                    etiquetaDatosViaje[2].setText(datosDelPasajero[2]+textos[3].getText());
                    
                    
                    
                    etiquetaDatosViaje[5].setText(datosDelPasajero[5]+origen.getSelectedItem());
                    etiquetaDatosViaje[6].setText(datosDelPasajero[6]+destino.getSelectedItem());
                    
                    
                    add(panelDatosViaje);
                    
                }
            }

        

    }
}
