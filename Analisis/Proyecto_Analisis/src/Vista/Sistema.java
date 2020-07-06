/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Sistema.ControlBD;
import Sistema.Departamento;
import Sistema.Factura;
import Sistema.Prestamo;
import Sistema.Recopilador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flore
 */
public class Sistema extends javax.swing.JFrame {
    
    Recopilador aux_reco;
    Departamento aux_dep = new Departamento();
    Factura aux_fac = new Factura();
    ArrayList<Factura> Array_fac = new ArrayList<Factura>();
    ArrayList<Prestamo> Array_pres = new ArrayList<Prestamo>();
    Prestamo aux_pres = new Prestamo();
    ControlBD db = new ControlBD();
    DefaultTableModel tabla1 = new DefaultTableModel();
    DefaultTableModel tabla2 = new DefaultTableModel();
    DefaultTableModel tabla3 = new DefaultTableModel();
    
    public Sistema() {
        
        this.aux_reco = new Recopilador();
        initComponents();
        DefaultTableModel tabla1;
        tabla1 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int Fila, int Colum) {
                return false;
            }
            
        };
        
        DefaultTableModel tabla2;
        tabla2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int Fila, int Colum) {
                return false;
            }
            
        };
        
        DefaultTableModel tabla3;
        tabla3 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int Fila, int Colum) {
                return false;
            }
            
        };
        cargarColumnas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sistema = new javax.swing.JTabbedPane();
        Recopilador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        f_inicial = new javax.swing.JTextField();
        f_final = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        no_caja = new javax.swing.JTextField();
        Local = new javax.swing.JComboBox<>();
        Agregar_rec = new javax.swing.JButton();
        mes = new javax.swing.JComboBox<>();
        modificar_rec = new javax.swing.JButton();
        Eliminar_rec = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        Estado_rec = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        folio = new javax.swing.JTextField();
        Buscar2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        banco_reco = new javax.swing.JComboBox<>();
        Factura = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prov = new javax.swing.JTextField();
        id_fac = new javax.swing.JTextField();
        Agregar_fac = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        modificar_fac = new javax.swing.JButton();
        Eliminar_fac = new javax.swing.JButton();
        Buscar_fac = new javax.swing.JButton();
        limpiar_fac = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        Estado_fac = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_factura = new javax.swing.JTable();
        tipo1 = new javax.swing.JComboBox<>();
        Mostrar_fac = new javax.swing.JButton();
        Prestamo = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        dep = new javax.swing.JComboBox<>();
        tipo_doc = new javax.swing.JComboBox<>();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        fecha_pres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_prestamo = new javax.swing.JTable();
        folio_fac = new javax.swing.JTextField();
        crear_pres = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        id_pres = new javax.swing.JTextField();
        modificar_pres = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        fecha_entrega = new javax.swing.JTextField();
        finalizar_pres = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        dep1 = new javax.swing.JComboBox<>();
        jLabel122 = new javax.swing.JLabel();
        ver_pres = new javax.swing.JButton();
        limpiar_pres = new javax.swing.JButton();
        tipo_doc1 = new javax.swing.JComboBox<>();
        tipo_doc2 = new javax.swing.JComboBox<>();
        eliminar_pres = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        buscar_pres = new javax.swing.JButton();
        Ver_reco = new javax.swing.JPanel();
        anios = new javax.swing.JComboBox<>();
        Banco = new javax.swing.JComboBox<>();
        Mostrar_reco = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_recopiladores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Folio Inicial");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Folio Final");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Mes");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("No. Caja");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Localización");

        no_caja.setEditable(false);
        no_caja.setText("0");

        Local.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Activo", "Muerto" }));

        Agregar_rec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Agregar_rec.setText("Agregar");
        Agregar_rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_recActionPerformed(evt);
            }
        });

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        modificar_rec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modificar_rec.setText("Modificar");
        modificar_rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_recActionPerformed(evt);
            }
        });

        Eliminar_rec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Eliminar_rec.setText("Eliminar");
        Eliminar_rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_recActionPerformed(evt);
            }
        });

        Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        Estado_rec.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Buscar recopilador por folio");

        Buscar2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Buscar2.setText("Buscar recopilador");
        Buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Banco");

        banco_reco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Bajio", "Bancomer", "Santander", "Bajio DLL", "Bancomer DLL", "Santander DLL" }));

        javax.swing.GroupLayout RecopiladorLayout = new javax.swing.GroupLayout(Recopilador);
        Recopilador.setLayout(RecopiladorLayout);
        RecopiladorLayout.setHorizontalGroup(
            RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecopiladorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RecopiladorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(no_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RecopiladorLayout.createSequentialGroup()
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f_final, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RecopiladorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RecopiladorLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(banco_reco, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiar)
                    .addComponent(Eliminar_rec)
                    .addGroup(RecopiladorLayout.createSequentialGroup()
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agregar_rec)
                            .addComponent(modificar_rec))
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RecopiladorLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(RecopiladorLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Estado_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(RecopiladorLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(Buscar2))))
                    .addComponent(Buscar))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        RecopiladorLayout.setVerticalGroup(
            RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecopiladorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(f_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar_rec)
                    .addComponent(jLabel12))
                .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RecopiladorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificar_rec)
                            .addComponent(f_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Eliminar_rec)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar)
                            .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiar)
                            .addComponent(jLabel6)
                            .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(banco_reco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(RecopiladorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar2)
                        .addGap(55, 55, 55)
                        .addComponent(Estado_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(RecopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(no_caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
        );

        Sistema.addTab("Recopilador", Recopilador);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Tipo");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Proveedor");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("No. Factura");

        Agregar_fac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Agregar_fac.setText("Agregar");
        Agregar_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_facActionPerformed(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Materia Prima", "Servicio", "Transporte" }));

        modificar_fac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modificar_fac.setText("Modificar");
        modificar_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_facActionPerformed(evt);
            }
        });

        Eliminar_fac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Eliminar_fac.setText("Eliminar");
        Eliminar_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_facActionPerformed(evt);
            }
        });

        Buscar_fac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Buscar_fac.setText("Buscar");
        Buscar_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_facActionPerformed(evt);
            }
        });

        limpiar_fac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        limpiar_fac.setText("Limpiar");
        limpiar_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_facActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Id");

        Estado_fac.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        Tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla_factura);

        tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Materia Prima", "Servicio", "Transporte" }));

        Mostrar_fac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Mostrar_fac.setText("Mostrar ");
        Mostrar_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_facActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FacturaLayout = new javax.swing.GroupLayout(Factura);
        Factura.setLayout(FacturaLayout);
        FacturaLayout.setHorizontalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FacturaLayout.createSequentialGroup()
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prov, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FacturaLayout.createSequentialGroup()
                                        .addComponent(Agregar_fac)
                                        .addGap(36, 36, 36)
                                        .addComponent(limpiar_fac))
                                    .addComponent(Eliminar_fac)
                                    .addComponent(Buscar_fac)
                                    .addGroup(FacturaLayout.createSequentialGroup()
                                        .addComponent(modificar_fac)
                                        .addGap(151, 151, 151)
                                        .addComponent(Estado_fac))))
                            .addGroup(FacturaLayout.createSequentialGroup()
                                .addComponent(tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(Mostrar_fac)))
                        .addGap(0, 309, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FacturaLayout.setVerticalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar_fac)
                            .addComponent(jLabel9)
                            .addComponent(id_fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiar_fac))
                        .addGap(19, 19, 19)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificar_fac)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Estado_fac))
                        .addGap(19, 19, 19)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Eliminar_fac)
                            .addComponent(jLabel8)
                            .addComponent(prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(Buscar_fac))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacturaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mostrar_fac)
                            .addComponent(tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Sistema.addTab("Factura", Factura);

        jLabel111.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel111.setText("Tipo");

        dep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Auditoria interna", "Auditoria externa", "Contablilidad" }));

        tipo_doc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Recopilador", "Factura" }));

        jLabel112.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel112.setText("Departamento");

        jLabel113.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel113.setText("Fecha prestamo");

        jLabel11.setText("AAAA/MM/DD");

        Tabla_prestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_prestamo);

        crear_pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        crear_pres.setText("Crear prestamo");
        crear_pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_presActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel115.setText("Id prestamo");

        modificar_pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modificar_pres.setText("Modificar");
        modificar_pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_presActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel116.setText("Fecha entrega");

        finalizar_pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        finalizar_pres.setText("Finalizar prestamo");
        finalizar_pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizar_presActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel117.setText("Ver prestamos por departamento");

        dep1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Auditoria interna", "Auditoria externa", "Contablilidad" }));

        jLabel122.setText("AAAA/MM/DD");

        ver_pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ver_pres.setText("Mostrar prestamos");
        ver_pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_presActionPerformed(evt);
            }
        });

        limpiar_pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        limpiar_pres.setText("Limpiar");
        limpiar_pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_presActionPerformed(evt);
            }
        });

        tipo_doc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Recopilador", "Factura" }));

        tipo_doc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Recopilador", "Factura" }));

        eliminar_pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminar_pres.setText("Eliminar");
        eliminar_pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_presActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel118.setText("No. Factura/Folio inicial");

        buscar_pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buscar_pres.setText("Buscar");
        buscar_pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_presActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrestamoLayout = new javax.swing.GroupLayout(Prestamo);
        Prestamo.setLayout(PrestamoLayout);
        PrestamoLayout.setHorizontalGroup(
            PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrestamoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(PrestamoLayout.createSequentialGroup()
                        .addComponent(dep1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tipo_doc1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(ver_pres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiar_pres)
                        .addGap(48, 48, 48))
                    .addGroup(PrestamoLayout.createSequentialGroup()
                        .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111)
                            .addGroup(PrestamoLayout.createSequentialGroup()
                                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel112)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel118)
                                    .addGroup(PrestamoLayout.createSequentialGroup()
                                        .addComponent(crear_pres)
                                        .addGap(15, 15, 15)
                                        .addComponent(modificar_pres)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PrestamoLayout.createSequentialGroup()
                                        .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PrestamoLayout.createSequentialGroup()
                                                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tipo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(folio_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(PrestamoLayout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addComponent(eliminar_pres)))
                                                .addGap(145, 145, 145))
                                            .addGroup(PrestamoLayout.createSequentialGroup()
                                                .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel115)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(id_pres, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PrestamoLayout.createSequentialGroup()
                                        .addComponent(fecha_pres, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel116)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PrestamoLayout.createSequentialGroup()
                                        .addComponent(tipo_doc2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(buscar_pres))
                                    .addGroup(PrestamoLayout.createSequentialGroup()
                                        .addComponent(fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel122))
                                    .addComponent(finalizar_pres)))
                            .addComponent(jLabel117))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PrestamoLayout.setVerticalGroup(
            PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrestamoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115)
                    .addComponent(id_pres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_doc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_pres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(tipo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrestamoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel113)
                            .addComponent(fecha_pres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(14, 14, 14)
                        .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(folio_fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel118))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crear_pres)
                            .addComponent(modificar_pres)
                            .addComponent(eliminar_pres)))
                    .addGroup(PrestamoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel122)
                            .addComponent(jLabel116))
                        .addGap(18, 18, 18)
                        .addComponent(finalizar_pres)))
                .addGap(42, 42, 42)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_pres)
                    .addComponent(limpiar_pres)
                    .addComponent(tipo_doc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Sistema.addTab("Prestamo", Prestamo);

        anios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Bajio", "Bancomer", "Santander", "Bajio DLL", "Bancomer DLL", "Santander DLL" }));

        Banco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        Mostrar_reco.setText("Mostrar");

        Tabla_recopiladores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tabla_recopiladores);

        javax.swing.GroupLayout Ver_recoLayout = new javax.swing.GroupLayout(Ver_reco);
        Ver_reco.setLayout(Ver_recoLayout);
        Ver_recoLayout.setHorizontalGroup(
            Ver_recoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ver_recoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ver_recoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                    .addGroup(Ver_recoLayout.createSequentialGroup()
                        .addComponent(anios, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mostrar_reco)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Ver_recoLayout.setVerticalGroup(
            Ver_recoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ver_recoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ver_recoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mostrar_reco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        Sistema.addTab("Listado de recopiladores", Ver_reco);

        getContentPane().add(Sistema, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_presActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_presActionPerformed
        if (id_pres.getText().isEmpty()
                || tipo_doc2.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Llene el ID del prestamo y elija el tipo de documento para buscar");
        } else {
            ResultSet resultado;
            //Asigna el id al prestamo auxiliar
            aux_pres.setId_pres(Integer.parseInt(id_pres.getText()));

            //Asigna el tipo al prestamo auxiliar y a la pantalla
            if (tipo_doc2.getSelectedItem() == "Recopilador") {
                aux_pres.setTipo(1);
                tipo_doc.setSelectedItem("Recopilador");
            } else {
                aux_pres.setTipo(2);
                tipo_doc.setSelectedItem("Factura");
            }

            //busca que exista el prestamo
            resultado = this.db.getQuery(this.aux_pres.buscar());
            
            try {
                //Si hay resultados se ejecuta este if
                if (resultado.next()) {
                    //se asigna el departamento al prestamo auxiliar
                    this.aux_pres.setId_dep(resultado.getInt("id_dep"));

                    //se asigna el valor del folio en el prestamo auxiliar segun el tipo
                    if (this.aux_pres.getTipo() == 1) {
                        this.aux_pres.setFolio_fac(resultado.getInt("folio_inicial"));
                    } else {
                        this.aux_pres.setFolio_fac(resultado.getInt("id_fac"));
                    }
                    //se asigna fecha de prestamo y entrega al auxiliar
                    this.aux_pres.setFecha_pres(String.valueOf(resultado.getDate("fecha_prestamo")));
                    this.aux_pres.setFecha_ent(String.valueOf(resultado.getDate("fecha_entrega")));

                    //se asigna departamento a pantalla
                    switch (aux_pres.getId_dep()) {
                        case 1:
                            dep.setSelectedItem("Auditoria interna");
                            
                            break;
                        case 2:
                            dep.setSelectedItem("Auditoria externa");
                            break;
                        case 3:
                            dep.setSelectedItem("Contabilidad");
                            break;
                    }
                    //se asignan valores a pantalla de fecha y folio
                    fecha_pres.setText(aux_pres.getFecha_pres());
                    folio_fac.setText(String.valueOf(aux_pres.getFolio_fac()));
                    
                    id_pres.setEditable(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese id o No. de factura");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_buscar_presActionPerformed

    private void eliminar_presActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_presActionPerformed
        if (id_pres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el id para eliminar");
        } else{
            aux_pres.setId_pres(Integer.parseInt(id_pres.getText()));
            db.setQuery(aux_pres.eliminar());
            
        }
        limpiar_prestamo();
    }//GEN-LAST:event_eliminar_presActionPerformed

    private void limpiar_presActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_presActionPerformed
        limpiar_prestamo();
    }//GEN-LAST:event_limpiar_presActionPerformed

    private void ver_presActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_presActionPerformed
        String Datos[] = new String[7];
        boolean bandera = false;
        ResultSet resultado;
        if (tipo_doc1.getSelectedItem() == "Seleccione" || dep1.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Elija el departamento o tipo de documento");
        } else {
            limpiar_tabla1();
            if (dep1.getSelectedItem() == "Auditoria interna") {
                aux_pres.setId_dep(1);
            } else if (dep1.getSelectedItem() == "Auditoria externa") {
                aux_pres.setId_dep(2);
            } else {
                aux_pres.setId_dep(3);
            }
            
            aux_dep.setId_dep(aux_pres.getId_dep());
            
            if (tipo_doc1.getSelectedItem() == "Recopilador") {
                aux_pres.setTipo(1);
            } else {
                aux_pres.setTipo(2);
            }
            
            resultado = this.db.getQuery(aux_dep.encargado());
            
            try {
                if (resultado.next()) {
                    aux_dep.setNom_encargado(resultado.getString("encargado"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            resultado = this.db.getQuery(aux_pres.verPrestamos());

            //Consulta sql
            try {
                
                while (resultado.next()) {
                    
                    bandera = true;
                    
                    Prestamo p = new Prestamo();
                    p.setId_pres(resultado.getInt("id_pres"));
                    p.setId_dep(resultado.getInt("id_dep"));
                    if (aux_pres.getTipo() == 1) {
                        p.setFolio_fac(resultado.getInt("folio_inicial"));
                    } else {
                        p.setFolio_fac(resultado.getInt("id_fac"));
                    }
                    p.setTipo(aux_pres.getTipo());
                    p.setFecha_pres(String.valueOf(resultado.getDate("fecha_prestamo")));
                    p.setFecha_ent(String.valueOf(resultado.getDate("fecha_entrega")));
                    
                    Array_pres.add(p);
                    
                }
                for (int i = 0; i < Array_pres.size(); i++) {
                    Prestamo p = new Prestamo();
                    p = Array_pres.get(i);
                    
                    Datos[0] = String.valueOf(p.getId_pres());
                    
                    switch (p.getId_dep()) {
                        case 1:
                            Datos[1] = "Auditoria Interna";
                            break;
                        case 2:
                            Datos[1] = "Auditoria Externa";
                            break;
                        case 3:
                            Datos[1] = "Contabilidad";
                            break;
                    }
                    
                    Datos[2] = aux_dep.getNom_encargado();
                    
                    if (p.getTipo() == 1) {
                        Datos[3] = "Recopilador";
                    } else {
                        Datos[3] = "Factura";
                    }
                    
                    Datos[4] = p.getFecha_pres();
                    
                    if (p.getFecha_ent().equals("1000-01-01")) {
                        Datos[5] = "----/--/--";
                    } else {
                        Datos[5] = p.getFecha_ent();
                    }
                    
                    Datos[6] = String.valueOf(p.getFolio_fac());
                    
                    tabla1.addRow(Datos);
                    
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Datos\n" + ex);
            }
            if (bandera == false) {
                
                JOptionPane.showMessageDialog(null, "No hay prestamos");
                
            }
            Array_pres.clear();
        }
    }//GEN-LAST:event_ver_presActionPerformed

    private void finalizar_presActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizar_presActionPerformed
        if (id_pres.getText().isEmpty()
                || tipo_doc2.getSelectedItem() == "Seleccione"
                || fecha_entrega.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene la fecha de entrega");
        } else {
            aux_pres.setId_pres(Integer.parseInt(id_pres.getText()));
            aux_pres.setFecha_ent(fecha_entrega.getText());
            
            aux_reco.setF_inicial(Integer.parseInt(folio_fac.getText()));
            aux_reco.setEstado(0);
            
            this.db.setQuery(aux_reco.estado());
            if (tipo_doc2.getSelectedItem() == "Recopilador") {
                aux_pres.setTipo(1);
            } else {
                aux_pres.setTipo(2);
            }
            
            this.db.setQuery(aux_pres.finalizar());
            limpiar_prestamo();
        }
    }//GEN-LAST:event_finalizar_presActionPerformed
//modificar prestamo
    private void modificar_presActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_presActionPerformed
        ResultSet resultado;
        int bandera = 1;
        int aux = aux_pres.getTipo();
        System.out.println(aux);
        if (dep.getSelectedItem() == "Seleccione"
                || tipo_doc.getSelectedItem() == "Seleccione"
                || fecha_pres.getText().isEmpty()
                || folio_fac.getText().isEmpty()
                || id_pres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            if (dep.getSelectedItem() == "Auditoria interna") {
                aux_pres.setId_dep(1);
            } else if (dep.getSelectedItem() == "Auditoria externa") {
                aux_pres.setId_dep(2);
            } else {
                aux_pres.setId_dep(3);
            }
            aux_dep.setId_dep(aux_pres.getId_dep());
            
            if (tipo_doc.getSelectedItem() == "Recopilador") {
                aux_pres.setTipo(1);
                aux_reco.setF_inicial(Integer.parseInt(folio_fac.getText()));
                aux_reco.setF_final(0);
                aux_reco.setEstado(1);
                
                resultado = db.getQuery(aux_reco.buscar());
                
                try {
                    if (resultado.next()) {
                        
                        if (aux == 1 && aux_pres.getTipo() == 2) {
                            bandera = 4;
                        } else if (aux == 2 && aux_pres.getTipo() == 1) {
                            bandera = 4;
                        } else if (aux == aux_pres.getTipo()) {
                            bandera = 3;
                        }
                        db.setQuery(aux_reco.estado());
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                aux_pres.setTipo(2);
                aux_fac.setId_fac(Integer.parseInt(folio_fac.getText()));
                aux_fac.setId(0);
                aux_fac.setEstado(1);
                
                resultado = db.getQuery(aux_fac.buscar());
                
                try {
                    if (resultado.next()) {
                        
                        if (aux == 1 && aux_pres.getTipo() == 2) {
                            bandera = 4;
                        } else if (aux == 2 && aux_pres.getTipo() == 1) {
                            bandera = 4;
                        } else if (aux == aux_pres.getTipo()) {
                            bandera = 3;
                            
                            db.setQuery(aux_fac.estado());
                        }
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (bandera == 3) {
                aux_pres.setFecha_pres(fecha_pres.getText());
                aux_pres.setFolio_fac(Integer.parseInt(folio_fac.getText()));
                aux_pres.setFecha_ent("1000/01/01");
                
                this.db.setQuery(aux_pres.modificar());
            } else if (bandera == 1) {
                JOptionPane.showMessageDialog(null, "no existe ese documento");
            } else if (bandera == 4) {
                this.db.setQuery(aux_pres.agregar());
                System.out.println(aux_pres.getId_pres());
                aux_pres.setTipo(aux);
                this.db.setQuery(aux_pres.eliminar());
            }
            limpiar_prestamo();
        }
    }//GEN-LAST:event_modificar_presActionPerformed
//crear prestamo
    private void crear_presActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_presActionPerformed
        ResultSet resultado;
        int bandera = 1;
        
        if (dep.getSelectedItem() == "Seleccione"
                || tipo_doc.getSelectedItem() == "Seleccione"
                || fecha_pres.getText().isEmpty()
                || folio_fac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            if (dep.getSelectedItem() == "Auditoria interna") {
                aux_pres.setId_dep(1);
            } else if (dep.getSelectedItem() == "Auditoria externa") {
                aux_pres.setId_dep(2);
            } else {
                aux_pres.setId_dep(3);
            }
            aux_dep.setId_dep(aux_pres.getId_dep());
            
            if (tipo_doc.getSelectedItem() == "Recopilador") {
                aux_pres.setTipo(1);
                aux_reco.setF_inicial(Integer.parseInt(folio_fac.getText()));
                aux_reco.setF_final(0);
                aux_reco.setEstado(1);
                
                resultado = db.getQuery(aux_reco.buscar());
                
                try {
                    if (resultado.next()) {
                        
                        if (resultado.getInt("estado") == 1) {
                            bandera = 2;
                            JOptionPane.showMessageDialog(null, "Documento en prestamo");
                        } else {
                            bandera = 3;
                            db.setQuery(aux_reco.estado());
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                aux_pres.setTipo(2);
                aux_fac.setId_fac(Integer.parseInt(folio_fac.getText()));
                aux_fac.setId(0);
                aux_fac.setEstado(1);
                
                resultado = db.getQuery(aux_fac.buscar());
                
                try {
                    if (resultado.next()) {
                        if (resultado.getInt("estado") == 1) {
                            bandera = 2;
                            JOptionPane.showMessageDialog(null, "Documento en prestamo");
                        } else {
                            bandera = 3;
                            db.setQuery(aux_fac.estado());
                        }
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (bandera == 3) {
                aux_pres.setFecha_pres(fecha_pres.getText());
                aux_pres.setFolio_fac(Integer.parseInt(folio_fac.getText()));
                aux_pres.setFecha_ent("1000/01/01");
                
                System.out.println(aux_pres.agregar());
                this.db.setQuery(aux_pres.agregar());
            } else if (bandera == 1) {
                JOptionPane.showMessageDialog(null, "no existe ese documento");
            }
            
        }
        limpiar_prestamo();
    }//GEN-LAST:event_crear_presActionPerformed
//mostrar facturas
    private void Mostrar_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_facActionPerformed
        String Datos[] = new String[5];
        
        boolean bandera = false;
        ResultSet resultado;
        
        if (tipo1.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Elija un tipo");
        } else {
            limpiar_tabla2();
            if (tipo1.getSelectedItem() == "Materia Prima") {
                this.aux_fac.setTipo(1);
            } else if (tipo1.getSelectedItem() == "Servicio") {
                this.aux_fac.setTipo(2);
            } else {
                this.aux_fac.setTipo(3);
            }
            resultado = db.getQuery(this.aux_fac.mostrar());
            
            try {
                while (resultado.next()) {
                    bandera = true;
                    
                    Factura n = new Factura();
                    n.setId(resultado.getInt("id"));
                    n.setId_fac(resultado.getInt("id_fac"));
                    n.setProveedor(resultado.getInt("proveedor"));
                    n.setEstado(resultado.getInt("estado"));
                    n.setTipo(resultado.getInt("tipo"));
                    
                    Array_fac.add(n);
                    
                }
                Collections.sort(Array_fac);
                for (int i = 0; i < Array_fac.size(); i++) {
                    Factura n = new Factura();
                    
                    n = Array_fac.get(i);
                    Datos[0] = String.valueOf(n.getId());
                    
                    Datos[1] = String.valueOf(n.getId_fac());
                    switch (n.getTipo()) {
                        case 1:
                            Datos[2] = "Materia Prima";
                            break;
                        case 2:
                            Datos[2] = "Servicio";
                            break;
                        case 3:
                            Datos[2] = "Transporte";
                            break;
                    }
                    Datos[3] = String.valueOf(n.getProveedor());
                    if (n.getEstado() == 0) {
                        Datos[4] = "Disponible";
                    } else {
                        Datos[4] = "Prestamo";
                    }
                    tabla2.addRow(Datos);
                }
                Array_fac.clear();
            } catch (SQLException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            if (bandera == false) {
                
                JOptionPane.showMessageDialog(null, "No hay registros");
                
            }
        }

    }//GEN-LAST:event_Mostrar_facActionPerformed
//limpiar factura
    private void limpiar_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_facActionPerformed
        limpiar_fac();
    }//GEN-LAST:event_limpiar_facActionPerformed
//buscar factura
    private void Buscar_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_facActionPerformed
        if (id.getText().isEmpty() && id_fac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el campo id o No. de factura para realizar la busqueda");
        } else {
            ResultSet resultado;
            if (id.getText().isEmpty()) {
                this.aux_fac.setId(0);
                this.aux_fac.setId_fac(Integer.parseInt(id_fac.getText()));
            } else {
                this.aux_fac.setId_fac(0);
                this.aux_fac.setId(Integer.parseInt(id.getText()));
            }
            resultado = this.db.getQuery(this.aux_fac.buscar());
            
            try {
                if (resultado.next()) {
                    this.aux_fac.setId_fac(resultado.getInt("id_fac"));
                    this.aux_fac.setProveedor(resultado.getInt("proveedor"));
                    this.aux_fac.setTipo(resultado.getInt("tipo"));
                    this.aux_fac.setId(resultado.getInt("id"));
                    this.aux_fac.setEstado(resultado.getInt("estado"));
                    
                    id_fac.setText(String.valueOf(aux_fac.getId_fac()));
                    prov.setText(String.valueOf(aux_fac.getProveedor()));
                    id.setText(String.valueOf(aux_fac.getId()));
                    
                    if (aux_fac.getEstado() == 0) {
                        Estado_fac.setText("Disponible");
                    } else {
                        Estado_fac.setText("En prestamo");
                    }
                    switch (aux_fac.getTipo()) {
                        case 1:
                            tipo.setSelectedItem("Materia Prima");
                            break;
                        case 2:
                            tipo.setSelectedItem("Servicio");
                            break;
                        case 3:
                            tipo.setSelectedItem("Transporte");
                            break;
                    }
                    id.setEditable(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese id o No. de factura");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_Buscar_facActionPerformed
//Eliminar factura
    private void Eliminar_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_facActionPerformed
        if (id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el campo id para realizar la eliminación");
        } else {
            this.aux_fac.setId(Integer.parseInt(id.getText()));
            this.db.setQuery(this.aux_fac.eliminar());
            limpiar_fac();
        }
    }//GEN-LAST:event_Eliminar_facActionPerformed
//modificar factura
    private void modificar_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_facActionPerformed
        if (tipo.getSelectedItem() == "Seleccione"
                || prov.getText().isEmpty()
                || id_fac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            this.aux_fac.setId_fac(Integer.parseInt(id_fac.getText()));
            this.aux_fac.setProveedor(Integer.parseInt(prov.getText()));
            if (tipo.getSelectedItem() == "Materia Prima") {
                this.aux_fac.setTipo(1);
            } else if (tipo.getSelectedItem() == "Servicio") {
                this.aux_fac.setTipo(2);
            } else {
                this.aux_fac.setTipo(3);
            }
            System.out.println(aux_fac.agregar());
            
            db.setQuery(aux_fac.modificar());
            limpiar_fac();
        }
    }//GEN-LAST:event_modificar_facActionPerformed
//Agregar factura
    private void Agregar_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_facActionPerformed
        if (tipo.getSelectedItem() == "Seleccione"
                || prov.getText().isEmpty()
                || id_fac.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            this.aux_fac.setId_fac(Integer.parseInt(id_fac.getText()));
            this.aux_fac.setProveedor(Integer.parseInt(prov.getText()));
            this.aux_fac.setEstado(0);
            
            if (tipo.getSelectedItem() == "Materia Prima") {
                this.aux_fac.setTipo(1);
            } else if (tipo.getSelectedItem() == "Servicio") {
                this.aux_fac.setTipo(2);
            } else {
                this.aux_fac.setTipo(3);
            }
            System.out.println(aux_fac.agregar());
            
            db.setQuery(aux_fac.agregar());
            limpiar_fac();
            
        }
    }//GEN-LAST:event_Agregar_facActionPerformed
//Buscar recopilador por folio especifico
    private void Buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar2ActionPerformed
        if (folio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el folio para buscar");
        } else {
            //Objeto para datos consulta
            ResultSet resultado;
            
            aux_reco.setFolio(Integer.parseInt(folio.getText()));
            resultado = this.db.getQuery(this.aux_reco.buscarFolio());
            no_caja.setEditable(true);
            try {
                if (resultado.next()) {
                    this.aux_reco.setF_inicial(resultado.getInt("folio_inicial"));
                    this.aux_reco.setF_final(resultado.getInt("folio_final"));
                    this.aux_reco.setMes(resultado.getString("mes"));
                    this.aux_reco.setAnio(resultado.getInt("año"));
                    this.aux_reco.setLocalizacion(resultado.getString("localizacion"));
                    this.aux_reco.setBanco(resultado.getString("banco"));
                    this.aux_reco.setNo_caja(resultado.getInt("id_caja"));
                    this.aux_reco.setEstado(resultado.getInt("estado"));
                    this.aux_reco.setId_rec(resultado.getInt("id_rec"));
                    
                    f_inicial.setText(String.valueOf(this.aux_reco.getF_inicial()));
                    f_final.setText(String.valueOf(this.aux_reco.getF_final()));
                    mes.setSelectedItem(this.aux_reco.getMes());
                    anio.setText(String.valueOf(this.aux_reco.getAnio()));
                    Local.setSelectedItem(this.aux_reco.getLocalizacion());
                    banco_reco.setSelectedItem(this.aux_reco.getBanco());
                    no_caja.setText(String.valueOf(this.aux_reco.getNo_caja()));
                    if (aux_reco.getEstado() == 0) {
                        Estado_rec.setText("Disponible");
                    } else {
                        Estado_rec.setText("En prestamo");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese recopilador");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_Buscar2ActionPerformed
//limpiar recopilador
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed
//Buscar recopilador por inicial o final
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (f_inicial.getText().isEmpty() && f_final.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el folio final o inicial para buscar");
        } else {
            //Objeto para datos consulta
            ResultSet resultado;
            if (f_inicial.getText().isEmpty()) {
                aux_reco.setF_inicial(0);
            } else {
                aux_reco.setF_inicial(Integer.parseInt(f_inicial.getText()));
            }
            if (f_final.getText().isEmpty()) {
                aux_reco.setF_final(0);
            } else {
                aux_reco.setF_final(Integer.parseInt(f_final.getText()));
            }
            
            resultado = this.db.getQuery(this.aux_reco.buscar());
            no_caja.setEditable(true);
            try {
                if (resultado.next()) {
                    this.aux_reco.setF_inicial(resultado.getInt("folio_inicial"));
                    this.aux_reco.setF_final(resultado.getInt("folio_final"));
                    this.aux_reco.setMes(resultado.getString("mes"));
                    this.aux_reco.setAnio(resultado.getInt("año"));
                    this.aux_reco.setLocalizacion(resultado.getString("localizacion"));
                    this.aux_reco.setBanco(resultado.getString("banco"));
                    this.aux_reco.setNo_caja(resultado.getInt("id_caja"));
                    this.aux_reco.setEstado(resultado.getInt("estado"));
                    this.aux_reco.setId_rec(resultado.getInt("id_rec"));
                    
                    f_inicial.setText(String.valueOf(this.aux_reco.getF_inicial()));
                    f_final.setText(String.valueOf(this.aux_reco.getF_final()));
                    mes.setSelectedItem(this.aux_reco.getMes());
                    anio.setText(String.valueOf(this.aux_reco.getAnio()));
                    Local.setSelectedItem(this.aux_reco.getLocalizacion());
                    banco_reco.setSelectedItem(this.aux_reco.getBanco());
                    no_caja.setText(String.valueOf(this.aux_reco.getNo_caja()));
                    if (aux_reco.getEstado() == 0) {
                        Estado_rec.setText("Disponible");
                    } else {
                        Estado_rec.setText("En prestamo");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese recopilador");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_BuscarActionPerformed
//Eliminar recopilador
    private void Eliminar_recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_recActionPerformed
        if (f_inicial.getText().isEmpty()
                || f_final.getText().isEmpty()
                || mes.getSelectedItem() == "Seleccione"
                || anio.getText().isEmpty()
                || Local.getSelectedItem() == "Seleccione"
                || no_caja.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            aux_reco.setF_inicial(Integer.parseInt(f_inicial.getText()));
            db.setQuery(aux_reco.eliminar());
            limpiar();
        }
    }//GEN-LAST:event_Eliminar_recActionPerformed
//Agregar recopilador
    private void Agregar_recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_recActionPerformed
        if (f_inicial.getText().isEmpty()
                || f_final.getText().isEmpty()
                || mes.getSelectedItem() == "Seleccione"
                || anio.getText().isEmpty()
                || Local.getSelectedItem() == "Seleccione"
                || no_caja.getText().isEmpty()
                || banco_reco.getSelectedItem() == "Seleccione") {
            
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            aux_reco.setF_inicial(Integer.parseInt(f_inicial.getText()));
            aux_reco.setF_final(Integer.parseInt(f_final.getText()));
            aux_reco.setMes((String) mes.getSelectedItem());
            aux_reco.setAnio(Integer.parseInt(anio.getText()));
            aux_reco.setLocalizacion((String) Local.getSelectedItem());
            aux_reco.setBanco((String) banco_reco.getSelectedItem());
            aux_reco.setNo_caja(Integer.parseInt(no_caja.getText()));
            aux_reco.setEstado(0);
            
            if (aux_reco.getF_inicial() > aux_reco.getF_final()) {
                JOptionPane.showMessageDialog(null, "El folio inicial no puede ser mayor que el folio final");
            } else {
                db.setQuery(aux_reco.agregar());
                limpiar();
            }
        }
    }//GEN-LAST:event_Agregar_recActionPerformed
//Modificar recopilador
    private void modificar_recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_recActionPerformed
        if (f_inicial.getText().isEmpty()
                || f_final.getText().isEmpty()
                || mes.getSelectedItem() == "Seleccione"
                || anio.getText().isEmpty()
                || Local.getSelectedItem() == "Seleccione"
                || no_caja.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            aux_reco.setF_inicial(Integer.parseInt(f_inicial.getText()));
            aux_reco.setF_final(Integer.parseInt(f_final.getText()));
            aux_reco.setMes((String) mes.getSelectedItem());
            aux_reco.setAnio(Integer.parseInt(anio.getText()));
            aux_reco.setLocalizacion((String) Local.getSelectedItem());
            aux_reco.setBanco((String) banco_reco.getSelectedItem());
            aux_reco.setNo_caja(Integer.parseInt(no_caja.getText()));
            
            if (aux_reco.getF_inicial() > aux_reco.getF_final()) {
                JOptionPane.showMessageDialog(null, "El folio inicial no puede ser mayor que el folio final");
            } else {
                db.setQuery(aux_reco.modificar());
                limpiar();
            }
        }
    }//GEN-LAST:event_modificar_recActionPerformed
    
    void limpiar() {
        f_inicial.setText("");
        f_final.setText("");
        mes.setSelectedItem("Seleccione");
        anio.setText("");
        Local.setSelectedItem("Seleccione");
        banco_reco.setSelectedItem("Seleccione");
        no_caja.setText("0");
        folio.setText("");
        Estado_rec.setText("");
        
        aux_reco.setF_inicial(0);
        aux_reco.setF_final(0);
        aux_reco.setMes("");
        aux_reco.setAnio(0);
        aux_reco.setLocalizacion("");
        aux_reco.setBanco("");
        aux_reco.setNo_caja(0);
        aux_reco.setId_rec(0);
        
    }
    
    void limpiar_fac() {
        id_fac.setText("");
        prov.setText("");
        tipo.setSelectedItem("Seleccione");
        id.setEditable(true);
        id.setText("");
        Estado_fac.setText("");
        
        this.aux_fac.setId(0);
        this.aux_fac.setId_fac(0);
        this.aux_fac.setProveedor(0);
        this.aux_fac.setTipo(0);
        limpiar_tabla2();
        
    }
    
    void limpiar_prestamo() {
        id_pres.setText("");
        id_pres.setEditable(true);
        dep.setSelectedItem("Seleccione");
        dep1.setSelectedItem("Seleccione");
        tipo_doc.setSelectedItem("Seleccione");
        tipo_doc1.setSelectedItem("Seleccione");
        tipo_doc2.setSelectedItem("Seleccione");
        fecha_pres.setText("");
        fecha_entrega.setText("");
        folio_fac.setText("");
        
        aux_pres.setFecha_ent("");
        aux_pres.setFecha_pres("");
        aux_pres.setFolio_fac(0);
        aux_pres.setId_dep(0);
        aux_pres.setId_pres(0);
        aux_pres.setTipo(0);
        limpiar_tabla1();
        
    }

    //Tablas
    private void limpiar_tabla1() {
        try {
            this.tabla1 = (DefaultTableModel) Tabla_prestamo.getModel();
            int filas = tabla1.getRowCount();
            for (int i = 0; filas > i; i++) {
                tabla1.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    private void limpiar_tabla2() {
        try {
            this.tabla2 = (DefaultTableModel) Tabla_factura.getModel();
            int filas = tabla2.getRowCount();
            for (int i = 0; filas > i; i++) {
                tabla2.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    public void cargarColumnas() {

        //tabla prestamos
        tabla1.addColumn("Id. Prestamo");
        tabla1.addColumn("Departamento");
        tabla1.addColumn("Encargado");
        tabla1.addColumn("Tipo Doc");
        tabla1.addColumn("Fecha Prestamo");
        tabla1.addColumn("Fecha Entrega");
        tabla1.addColumn("No. Factura/Folio inicial");
        
        this.Tabla_prestamo.setModel(tabla1);

        //Tabla facturas
        tabla2.addColumn("Id. Factura");
        tabla2.addColumn("No. Factura");
        tabla2.addColumn("Tipo");
        tabla2.addColumn("Proveedor");
        tabla2.addColumn("Estado");
        
        this.Tabla_factura.setModel(tabla2);

        //Tabla Recopiladores
        tabla3.addColumn("Folio Inicial");
        tabla3.addColumn("Folio Final");
        tabla3.addColumn("Mes");
        tabla3.addColumn("Año");
        tabla3.addColumn("Banco");
        tabla3.addColumn("Localización");
        tabla3.addColumn("No. Caja");
        tabla3.addColumn("Estado");
        
        this.Tabla_recopiladores.setModel(tabla3);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_fac;
    private javax.swing.JButton Agregar_rec;
    private javax.swing.JComboBox<String> Banco;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Buscar2;
    private javax.swing.JButton Buscar_fac;
    private javax.swing.JButton Eliminar_fac;
    private javax.swing.JButton Eliminar_rec;
    private javax.swing.JLabel Estado_fac;
    private javax.swing.JLabel Estado_rec;
    private javax.swing.JPanel Factura;
    private javax.swing.JComboBox<String> Local;
    private javax.swing.JButton Mostrar_fac;
    private javax.swing.JButton Mostrar_reco;
    private javax.swing.JPanel Prestamo;
    private javax.swing.JPanel Recopilador;
    private javax.swing.JTabbedPane Sistema;
    private javax.swing.JTable Tabla_factura;
    private javax.swing.JTable Tabla_prestamo;
    private javax.swing.JTable Tabla_recopiladores;
    private javax.swing.JPanel Ver_reco;
    private javax.swing.JTextField anio;
    private javax.swing.JComboBox<String> anios;
    private javax.swing.JComboBox<String> banco_reco;
    private javax.swing.JButton buscar_pres;
    private javax.swing.JButton crear_pres;
    private javax.swing.JComboBox<String> dep;
    private javax.swing.JComboBox<String> dep1;
    private javax.swing.JButton eliminar_pres;
    private javax.swing.JTextField f_final;
    private javax.swing.JTextField f_inicial;
    private javax.swing.JTextField fecha_entrega;
    private javax.swing.JTextField fecha_pres;
    private javax.swing.JButton finalizar_pres;
    private javax.swing.JTextField folio;
    private javax.swing.JTextField folio_fac;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_fac;
    private javax.swing.JTextField id_pres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton limpiar_fac;
    private javax.swing.JButton limpiar_pres;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JButton modificar_fac;
    private javax.swing.JButton modificar_pres;
    private javax.swing.JButton modificar_rec;
    private javax.swing.JTextField no_caja;
    private javax.swing.JTextField prov;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JComboBox<String> tipo1;
    private javax.swing.JComboBox<String> tipo_doc;
    private javax.swing.JComboBox<String> tipo_doc1;
    private javax.swing.JComboBox<String> tipo_doc2;
    private javax.swing.JButton ver_pres;
    // End of variables declaration//GEN-END:variables
}
