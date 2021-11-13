package analizador;
import java.io.*;
import java.util.regex.*;
import javax.swing.*;
import java_cup.runtime.Symbol;

public class Analizador extends javax.swing.JFrame {
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    public Analizador() {
        initComponents();
        this.setLocationRelativeTo(null);
    } 

public String abrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception ex) {
            System.out.println("ERROR!" + ex);
        }
        return documento;
    }

    public String guardarArchivo(File archivo, String documento) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado";
        } catch (Exception ex) {
            System.out.println("ERROR!" + ex);
        }
        return mensaje;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExp = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRegEx = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSintaxis = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtExp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpActionPerformed(evt);
            }
        });

        btnAbrir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAbrir.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\file-rounded-empty-sheet_icon-icons.com_73253.png")); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\save-button-interface-symbol-of-outlined-diskette_icon-icons.com_73167.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegEx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegEx.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\regex_icon_132036 (1).png")); // NOI18N
        btnRegEx.setText("RegEx");
        btnRegEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegExActionPerformed(evt);
            }
        });

        btnAnalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAnalizar.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\analizar.png")); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        txtEntrada.setBackground(new java.awt.Color(51, 51, 51));
        txtEntrada.setColumns(20);
        txtEntrada.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtEntrada.setForeground(new java.awt.Color(0, 204, 102));
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        txtSalida.setBackground(new java.awt.Color(51, 51, 51));
        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(0, 204, 102));
        txtSalida.setRows(5);
        jScrollPane2.setViewportView(txtSalida);

        txtSintaxis.setBackground(new java.awt.Color(51, 51, 51));
        txtSintaxis.setColumns(20);
        txtSintaxis.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtSintaxis.setForeground(new java.awt.Color(0, 204, 102));
        txtSintaxis.setRows(5);
        jScrollPane3.setViewportView(txtSintaxis);

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\icono (1).png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 67, Short.MAX_VALUE)
                                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegEx)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnalizar))
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnalizar)
                            .addComponent(btnRegEx)
                            .addComponent(btnGuardar)
                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegExActionPerformed
        String RegEx = txtExp.getText();
        final Pattern pattern = Pattern.compile(RegEx, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(abrirArchivo(archivo));
        String resultado = "";
        while (matcher.find()) {
            resultado += matcher.group(0) + "\n";
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
        txtSalida.setText(resultado);
    }//GEN-LAST:event_btnRegExActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = abrirArchivo(archivo);
                txtEntrada.setText(documento);
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_btnAnalizarActionPerformed
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            // Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(JFlexGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Reader lector;
        try {
            analizarLexico();
            analizarSintaxis();
        } catch (FileNotFoundException ex) {
        // Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(JFlexGen.class  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
        // Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(JFlexGen.class  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void analizarLexico() throws IOException {
        int cont = 1;
        String expr = (String) txtEntrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultad = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtSalida.setText(resultad);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultad += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultad += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultad += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultad += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultad += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultad += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultad += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultad += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultad += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultad += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultad += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultad += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultad += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultad += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultad += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultad += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultad += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultad += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultad += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultad += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultad += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultad += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultad += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultad += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultad += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultad += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultad += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultad += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultad += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultad += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultad += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
    
    private void analizarSintaxis() throws IOException {
        String ST = txtEntrada.getText();
        Sintax s = new Sintax(new analizador.LexerCup(new StringReader(ST)));
        try {
            s.parse();
            txtSintaxis.setText("Analizado correctamente");
        } catch (Exception ex) {
            Symbol sym = s.getS();
            if ((sym.right + 1)>0) {
                txtSintaxis.setText("Syntax ERROR. Línea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto:\"" + sym.value + "\"" );
            }
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = txtEntrada.getText();
                String mensaje = guardarArchivo(archivo, documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpActionPerformed

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
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
        public void run() {
                new Analizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegEx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextArea txtSintaxis;
    // End of variables declaration//GEN-END:variables
}
