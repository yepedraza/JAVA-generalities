
package newcalculator;

import javax.swing.table.DefaultTableModel;

public class CalculatorMatriz extends javax.swing.JFrame {
    public CalculatorMatriz() {
        initComponents();
    }
DefaultTableModel matriz1=new DefaultTableModel();
DefaultTableModel matriz2=new DefaultTableModel();
DefaultTableModel matrizr=new DefaultTableModel();
//Creacion de objetos matriz de tipo tablemodel
char operacion;
public Double matriz1d[][]=new Double [20][20], matriz2d[][]=new Double[20][20], matrizrd[][]=new Double[20][20], matrizid[][]=new Double[20][20],auxid,auxd;
int filaa,columnaa,columnab,d=0;
//Declaracion de variables, matrices y auxiliares
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        A = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        B = new javax.swing.JTable();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        inversa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Filaa = new javax.swing.JTextField();
        Columnaa = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Columnab = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Filab = new javax.swing.JTextField();
        Borrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        R = new javax.swing.JTable();
        igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        A.setModel(matriz1);
        jScrollPane2.setViewportView(A);

        B.setModel(matriz2);
        jScrollPane3.setViewportView(B);

        suma.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        suma.setText("Suma");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        resta.setText("Resta");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multiplicacion.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        multiplicacion.setText("Multiplicacion");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        inversa.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        inversa.setText("A*B^-1");
        inversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inversaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel1.setText("Filas de A (max20):");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel2.setText("Columnas de A (max20):");

        aceptar.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel3.setText("Columnas de B(max20):");

        Columnab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnabActionPerformed(evt);
            }
        });

        Aceptar.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        jLabel4.setText("Flias de B (max20):");

        Filab.setEditable(false);
        Filab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilabActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        Borrar.setText("Borrar Todo");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(suma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resta)
                .addGap(65, 65, 65)
                .addComponent(multiplicacion)
                .addGap(59, 59, 59)
                .addComponent(inversa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Filaa, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(Columnaa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aceptar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Columnab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Filab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aceptar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(Borrar)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(Filaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(Filab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Columnaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Columnab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(aceptar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Aceptar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resta)
                    .addComponent(suma)
                    .addComponent(multiplicacion)
                    .addComponent(inversa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Borrar)
                .addContainerGap())
        );

        R.setModel(matrizr);
        jScrollPane1.setViewportView(R);

        igual.setFont(new java.awt.Font("Comic Sans MS", 2, 11)); // NOI18N
        igual.setText("Resultado");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        for(int a=0;a < filaa;a++)
            for(int b=0; b<columnaa;b++)
                matriz1d[a][b]=Double.valueOf(String.valueOf(A.getValueAt(a,b)));
        matriz2.setRowCount(columnaa);
        Filab.setText(String.valueOf(columnaa));
        operacion='*'; 
        /*El boton multiplicacion almacena los datos de la tabla A en la matriz1f, tambien asigna el tamaño de columnaa
        a la fila de matriz2, muestra este valor en el textfield Filab y por ultimo asigna * al caracter operacion
        */
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        filaa=Integer.parseInt(Filaa.getText());
        columnaa= Integer.parseInt(Columnaa.getText());
        matriz1.setColumnCount(columnaa);
        matriz1.setRowCount(filaa);
        /*El boton aceptar asigna los valores obtenidos por los textfield Filaa y Columnaa a las variables enteras de mismo
        nombre y luego asigna estas variables a el tamaño de fila y columna de la matriz1
        */
    }//GEN-LAST:event_aceptarActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        for(int a=0;a < filaa;a++)
            for(int b=0; b<columnaa;b++)
                matriz1d[a][b]=Double.valueOf(String.valueOf(A.getValueAt(a,b)));
        matriz2.setRowCount(filaa);
        matriz2.setColumnCount(columnaa);
        Filab.setText(String.valueOf(filaa));
        Columnab.setText(String.valueOf(columnaa));
        operacion='+';
        /*El boton suma almacena los datos obtenidos en la tabla A en la matriz1f, luego asigna el tamaño de filas y columnas
        a la matriz2, despues muestra los valores del tamaño en los textfield Columnab y Filab y asigna + al caracter operacion
        */
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        for(int a=0;a < filaa;a++)
            for(int b=0; b<columnaa;b++)
                matriz1d[a][b]=Double.valueOf(String.valueOf(A.getValueAt(a,b)));
        matriz2.setRowCount(filaa);
        matriz2.setColumnCount(columnaa);
        Filab.setText(String.valueOf(filaa));
        Columnab.setText(String.valueOf(columnaa));
        operacion='-';   
        /*El boton resta almacena los datos obtenidos en la tabla A en la matriz1f, luego asigna el tamaño de filas y columnas
        a la matriz2, despues muestra los valores del tamaño en los textfield Columnab y Filab y asigna - al caracter operacion
        */
    }//GEN-LAST:event_restaActionPerformed

    private void inversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inversaActionPerformed
        for(int a=0;a < filaa;a++)
            for(int b=0; b<columnaa;b++)
                matriz1d[a][b]=Double.valueOf(String.valueOf(A.getValueAt(a,b)));
        matriz2.setRowCount(columnaa);
        matriz2.setColumnCount(columnaa);
        Filab.setText(String.valueOf(columnaa));
        Columnab.setText(String.valueOf(columnaa));
        operacion='/'; 
        /*El boton inversa almacena los datos de la tabla A en la matriz1f, tambien asigna el tamaño de columnaa a la fila
        y columna de matriz2,muestra estos valores en los textfield Filab y Columnab y por ultimo asigna / al caracter operacion
        */
    }//GEN-LAST:event_inversaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        switch(operacion)
        {
            case'+':
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                        matriz2d[a][b]=Double.valueOf(String.valueOf(B.getValueAt(a,b)));
    //Se almacenan los datos obtenidos en tabla B en la matriz2f
                matrizr.setRowCount(filaa);
                matrizr.setColumnCount(columnaa);
    //Se asigna el tamaño de la matrizr con los valores de filaa y columnaa
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                        matrizrd[a][b]= matriz1d[a][b] + matriz2d[a][b];
    /*Se suma en el espacio a b de la matrizrf lo que halla en la matriz1f en el espacio a b con lo que halla en la matriz2f
    en el espacio a b           
    */
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                        R.setValueAt(String.valueOf(matrizrd[a][b]),a,b);
    //Se muestra en la tabla R los valores de la matrizrf en el espacio a b
            break;
                
            case'-':
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                        matriz2d[a][b]=Double.valueOf(String.valueOf(B.getValueAt(a,b)));
    //Se almacenan los datos obtenidos en tabla B en la matriz2f
                matrizr.setRowCount(filaa);
                matrizr.setColumnCount(columnaa);
    //Se asigna el tamaño de la matrizr con los valores de filaa y columnaa
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                        matrizrd[a][b]= matriz1d[a][b] - matriz2d[a][b];
    /*Se resta en el espacio a b de la matrizrf lo que halla en la matriz1f en el espacio a b con lo que halla en la matriz2f
    en el espacio a b           
    */
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                        R.setValueAt(String.valueOf(matrizrd[a][b]),a,b);
    //Se muestra en la tabla R los valores de la matrizrf en el espacio a b
            break;
            case'*':
                for(int a=0;a < columnaa;a++)
                    for(int b=0; b<columnab;b++)
                        matriz2d[a][b]=Double.valueOf(String.valueOf(B.getValueAt(a,b)));
    //Se almacenan los datos obtenidos en tabla B en la matriz2f
                matrizr.setRowCount(filaa);
                matrizr.setColumnCount(columnab);
    //Se asigna el tamaño de la matrizr con los valores de filaa y columnab  
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnab;b++)
                            matrizrd[a][b]=0.0;
    //Se inicializa en 0 flotante la matrizrf
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnab;b++)
                        for(int c=0;c<columnaa;c++)
                            matrizrd[a][b]=matrizrd[a][b]+ (matriz1d[a][c] * matriz2d[c][b]);
    /*Se multiplica en el espacio a b de la matrizrf lo que halla en la matriz1f en el espacio a c con lo que halla en la matriz2f
    en el espacio c b y luego se suma a lo que ya se encuentre en la matrizrf en el espacio a b           
    */
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnab;b++)
                        R.setValueAt(String.valueOf(matrizrd[a][b]),a,b);
    //Se muestra en la tabla R los valores de la matrizrf en el espacio a b
            break;
            case'/':
                for(int a=0;a < columnaa;a++)
                    for(int b=0; b<columnaa;b++)
                        matriz2d[a][b]=Double.valueOf(String.valueOf(B.getValueAt(a,b)));
    //Se almacenan los datos obtenidos en tabla B en la matriz2f
                matrizr.setRowCount(filaa);
                matrizr.setColumnCount(columnaa);
    //Se asigna el tamaño de la matrizr con los valores de filaa y columnaa
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                    {
                        matrizrd[a][b]=0.0;
                        matrizid[a][b]=0.0;
                    }
    //Se inicializa en 0 flotante la matrizrf y la matrizif
                for(int a=0;a<filaa;a++)
                {
                    matrizid[a][d]=1.0;
                    d++;
                }
                d=0;
    /*En la matrizif se crea una matriz identidad del tamaño de la matriz2f, se aumenta en uno la variable d
    y se vuelve a inicializar en 0 la variable d
                */
                for(int a=0;a<columnaa;a++)
                {
                    auxid=matriz2d[a][d];                   
                    for(int b=0;b<columnaa;b++)
                    {
                        matriz2d[a][b]=matriz2d[a][b]/auxid;
                        matrizid[a][b]=matrizid[a][b]/auxid;
                    }
    /*A la variable auxif se le asigna lo que halla en matriz2f en el espacio a d, luego
    la matriz2f y matrizif en el espacio a b se dividen en auxif
    */
                    for(int c=0;c<columnaa;c++)
                    {
                        if(c!=a)
                        {
                            auxd=matriz2d[c][d];
                            for(int b=0;b<filaa;b++)
                            {
                                matriz2d[c][b]=matriz2d[c][b]-(matriz2d[a][b]*auxd);
                                matrizid[c][b]=matrizid[c][b]-(matrizid[a][b]*auxd);
                            }
                        }
                    } 
                d++;
                }
    /*El condicional indica que la operacion no se realizara en la misma fila de la operacion anterior, se asigna a la variable
    auxf lo que halla en la matriz2f en el espacio c d, luego lo que se encuetre en la matriz2f y matrizif en el espacio a b 
    se multiplica por auxf y esto se resta a lo que se encuetre en la matriz2f y matrizif en el espacio c b, todo esto se asigna
    a matriz2f y matrizif respectivamente, por ultimo se le suma 1 a la variable d
    */
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnab;b++)
                        for(int c=0;c<columnaa;c++)
                            matrizrd[a][b]=matrizrd[a][b]+ (matriz1d[a][c] * matrizid[c][b]);
    /*Se multiplica en el espacio a b de la matrizrf lo que halla en la matriz1f en el espacio a c con lo que halla en la matrizif
    en el espacio c b y luego se suma a lo que ya se encuentre en la matrizrf en el espacio a b           
    */
                for(int a=0;a < filaa;a++)
                    for(int b=0; b<columnaa;b++)
                        R.setValueAt(String.valueOf(matrizid[a][b]),a,b);
    //Se muestra en la tabla R los valores de la matrizrf en el espacio a b
            break;                
        }
    }//GEN-LAST:event_igualActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        columnab= Integer.parseInt(Columnab.getText());
        matriz2.setColumnCount(columnab);
        /*El boton Aceptar asigna el valor obtenido por el textfield Columnab a la variable entera de mismo
        nombre y luego asigna esta variable a el tamaño columna de la matriz2
        */
    }//GEN-LAST:event_AceptarActionPerformed

    private void ColumnabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColumnabActionPerformed

    private void FilabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilabActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        for(int a=0;a < 20;a++)
            for(int b=0; b<20;b++)
            {
                matriz1d[a][b]=0.0;
                matriz2d[a][b]=0.0;
                matrizrd[a][b]=0.0;
                matrizid[a][b]=0.0;
            }
        //Se asigna en 0 flotante la matriz1f, matriz2f, matrizrf y matrizif
        matriz1.setColumnCount(0);
        matriz2.setColumnCount(0);
        matrizr.setColumnCount(0);
        matriz1.setRowCount(0);
        matriz2.setRowCount(0);
        matrizr.setRowCount(0);
        //Se le asigna el tamaño 0 0 a matriz1, matriz2 y matrizr
        Filaa.setText("");
        Filab.setText("");
        Columnaa.setText("");
        Columnab.setText("");
        //Se asigna espacio vacio a los textfield
        operacion=' ';
        //Se asigna vacio a variable operacion
        columnaa=0;
        columnab=0;
        filaa=0;
        d=0;
        //Se inicializa en 0 las variables columnaa, columnab, filaa y d
        auxid=0.0;
        auxd=0.0;
        //Se asigna 0 flotante a auxif y auxf
    }//GEN-LAST:event_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable A;
    private javax.swing.JButton Aceptar;
    private javax.swing.JTable B;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField Columnaa;
    private javax.swing.JTextField Columnab;
    private javax.swing.JTextField Filaa;
    private javax.swing.JTextField Filab;
    private javax.swing.JTable R;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton igual;
    private javax.swing.JButton inversa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
