
package pkg00825_luisalonsocendra_tarea1;
import java.util.Random;
import javax.swing.JOptionPane;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumEnteroLabel = new javax.swing.JLabel();
        Num_Ent = new javax.swing.JTextField();
        Sumar = new javax.swing.JButton();
        ResultadoLabel = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        Invertir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        GenerarArray = new javax.swing.JButton();
        Num_Mayor = new javax.swing.JButton();
        ResultadoArrayLabel = new javax.swing.JLabel();
        ResultadoArray = new javax.swing.JLabel();
        Num_Menor = new javax.swing.JButton();
        Contar_Pares = new javax.swing.JButton();
        Contar_Impares = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText_Array = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NumEnteroLabel.setText("Número entero:");

        Num_Ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_EntActionPerformed(evt);
            }
        });

        Sumar.setText("Sumar dígitos");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        ResultadoLabel.setText("Resultado:");

        Invertir.setText("Invertir dígitos");
        Invertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvertirActionPerformed(evt);
            }
        });

        jButton1.setText("Terminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GenerarArray.setText("Generar Array");
        GenerarArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarArrayActionPerformed(evt);
            }
        });

        Num_Mayor.setText("Número Mayor");
        Num_Mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_MayorActionPerformed(evt);
            }
        });

        ResultadoArrayLabel.setText("Resultado del Array:");

        Num_Menor.setText("Número Menor");
        Num_Menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_MenorActionPerformed(evt);
            }
        });

        Contar_Pares.setText("Contar Pares");
        Contar_Pares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contar_ParesActionPerformed(evt);
            }
        });

        Contar_Impares.setText("Contar Impares");
        Contar_Impares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contar_ImparesActionPerformed(evt);
            }
        });

        jText_Array.setColumns(20);
        jText_Array.setRows(5);
        jScrollPane1.setViewportView(jText_Array);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GenerarArray)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Num_Mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(Num_Menor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(Contar_Pares, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Invertir, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(Sumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Contar_Impares, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ResultadoArrayLabel)
                                .addGap(18, 18, 18)
                                .addComponent(ResultadoArray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumEnteroLabel)
                                    .addComponent(ResultadoLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Num_Ent, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumEnteroLabel)
                    .addComponent(Num_Ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sumar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultadoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Invertir))
                .addGap(34, 34, 34)
                .addComponent(GenerarArray)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResultadoArray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResultadoArrayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contar_Pares)
                    .addComponent(Num_Mayor)
                    .addComponent(Num_Menor)
                    .addComponent(Contar_Impares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num_EntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_EntActionPerformed
        
    }//GEN-LAST:event_Num_EntActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
        try{
            int n = Integer.parseInt(Num_Ent.getText());
            Resultado.setText("La suma de los dígitos del número " + Integer.toString(n) + "   es   " + Integer.toString(sumaDigitos(n)));
        } catch (NumberFormatException e) { //Catcher de errores 
            JOptionPane.showMessageDialog(null,
                    "Error: Número inválido. Ingrese un entero.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: No es posible dividir entre cero. Ingrese un entero.");
        }
    }//GEN-LAST:event_SumarActionPerformed

    private void InvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvertirActionPerformed
        try{
            int n = Integer.parseInt(Num_Ent.getText());
            Resultado.setText("Al invertir los dígitos del número " + Integer.toString(n) + "   tenemos   " + Integer.toString(invertirEntero(n, 0)));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: Número inválido. Ingrese un entero.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: No es posible dividir entre cero. Ingrese un entero.");
        }
    }//GEN-LAST:event_InvertirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GenerarArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarArrayActionPerformed
            /* 
             * PARTE 4 - GENERAR ARREGLO RANDOM: Crear un arreglo de 100 enteros generados aleatoriamente y mostrarlos.
             * EN EL ENCABEZADO DE LA TAREA 1, NO ESPECIFICA UTILIZAR RECURSIVIDAD. 
             * Se opta por un loop.
             */
            Random rand = new Random(); //Elemento rand de la clase Random()
            int randomNum = 0;          //Iniciamos randomNum que será utilizado como 
            //String numbers_String = ""; // 
            int numbers[] = new int[100]; //Arreglo de enteros con una longitud de 100
            for (int i = 0; i < 100; i++) {
                randomNum = rand.nextInt(250); //Genera un número random entre 0 y 250. Se escoje un rango amplio para poder ver la efectividad de los botones max y min.
                numbers[i] = randomNum; //Sustituye el índice i por el número random.
            }
            StringBuilder sb=new StringBuilder(); //Construye un StringBuilder vacío y con capacidad por defecto de 16 carácteres.
            for(int j=0;j< numbers.length-1;j++)
            {
               sb.append(numbers[j] + ", "); /* Añade al final del StringBuilder a la que se aplica, 
                                              * un String de un dato asociado a una variable primitiva.
                                              * Añade además un divisor de cada elemento ", " que se usa con el fin de extraer texto del JTextField.
                                              */
            }
            sb.append(numbers[numbers.length-1]); // Agrega el último elemento del array.
            jText_Array.setText(sb.toString());   //Añade el string sb al JTextField
    }//GEN-LAST:event_GenerarArrayActionPerformed

    private void Num_MayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_MayorActionPerformed
        String values = jText_Array.getText().replaceAll("\\s",""); //Eliminamos los espacios en blanco
        String[] strValues = values.split(",");                     //Usa los divisores agregados en el stringbuilder para separa valores.
        int[] intValues = new int[strValues.length];                //Crea un array para ser llenado por el parser que lee el JTextField
        for(int i = 0; i < strValues.length; i++) {
            try {
              intValues[i] = Integer.parseInt(strValues[i]);        //Llena los valores del array con el parseInt y los transforma a enteros.
            } catch (NumberFormatException nfe) {
            }
        }
        int n = intValues.length;
        ResultadoArray.setText("El número mayor del array es: " + findMax(intValues, n-1) + " se encuentra en la posición: " + Posicion(intValues,0, n-1,findMax(intValues, n-1)));
    }//GEN-LAST:event_Num_MayorActionPerformed

    private void Num_MenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_MenorActionPerformed
        String values = jText_Array.getText().replaceAll("\\s","");
        String[] strValues = values.split(",");
        int[] intValues = new int[strValues.length];
        for(int i = 0; i < strValues.length; i++) {
            try {
              intValues[i] = Integer.parseInt(strValues[i]);
            } catch (NumberFormatException nfe) {
            }
        }
        int n = intValues.length;
        ResultadoArray.setText("El número menor del array es: " + findMin(intValues, n-1)+ " se encuentra en la posición: " + Posicion(intValues,0, n-1,findMin(intValues, n-1)));
    }//GEN-LAST:event_Num_MenorActionPerformed

    private void Contar_ParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contar_ParesActionPerformed
        String values = jText_Array.getText().replaceAll("\\s","");
        String[] strValues = values.split(",");
        int[] intValues = new int[strValues.length];
        for(int i = 0; i < strValues.length; i++) {
            try {
              intValues[i] = Integer.parseInt(strValues[i]);
            } catch (NumberFormatException nfe) {
            }
        }
        ResultadoArray.setText("La cantidad de números pares del array es: " + Pares(intValues, 0));
    }//GEN-LAST:event_Contar_ParesActionPerformed

    private void Contar_ImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contar_ImparesActionPerformed
        String values = jText_Array.getText().replaceAll("\\s",""); //Eliminamos los espacios en blanco
        String[] strValues = values.split(",");
        int[] intValues = new int[strValues.length];
        for(int i = 0; i < strValues.length; i++) {
            try {
              intValues[i] = Integer.parseInt(strValues[i]);
            } catch (NumberFormatException nfe) {
            }
        }
        ResultadoArray.setText("La cantidad de números impares del array es: " + Impares(intValues, 0));
    }//GEN-LAST:event_Contar_ImparesActionPerformed
 
    public static void main(String args[]) {
            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    /*
    * PARTE 2 - SUMA DE DÍGITOS: Sumar dígitos del número ingresado por el usuario (utilizando recursividad).
    *
    *   Si 
    *       número = 1234
    *   Entonces 
    *       suma = 1+2+3+4 = 10
    *
    * INDUCCIÓN MATEMÁTICA
    *
    * Si n es un entero y A1,A2,...,Ak los digitos de n donde n = Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0
    * Para k = 1 
    *       n = A1*(10)^0 = A1 = sumaDigitos(n)
    *       Por ejemplo, 
    *       Si n = 4 = sumaDigitos(4)
    * Suponga que se cumple para el caso k dígitos, probaremos el caso de k+1 dígitos
    *       Caso k es, 
    *           n = Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0
    *       Por ejemplo, 1234 = 1(10)^3 + 2(10)^2 + 3(10)^1 + 4(10)^0
    *           sumaDigitos(1234) = 1 + sumaDigitos(234) = 1 + 2 + sumaDigitos(34) = 1 +2 + 3 + sumaDigitos(4) = 1 + 2 + 3 + 4
    * 
    *       Caso k+1 es,
    *           n = Ak+1*(10)^(k) + Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0
    *               Dado sumaDigitos(Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0) = sumaDigitos(n - Ak+1*(10)^(k))
    *           Entonces 
    *               sumaDigitos(n) = Ak+1 + sumaDigitos(n - Ak+1*(10)^(k))
    */
    private static int sumaDigitos(int num){
        if(num==0){ //Caso base. Si el  número es cero, la suma es cero. Caso k = 1 con n = 0
            return 0;
        } else {
            return sumaDigitos(num/10) + num%10; /*La operación num/10 ingresa un número con una parte entera y otra decimal en sumaDigitos que solo acepta enteros.
                                                  *Java acepta el parámetro pero solo pasa la parte entera como argumento. 
                                                  *Si n = Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0 
                                                  *entonces n/10 ingresado en sumaDigitos entra en la función como n = Ak*(10)^(k-2) + ... + A2*(10)^0
                                                  *El modulo retorna el residuo de la division num/10 
                                                  *entonces 1234%10 = 4 dado que 1234 es expresado como 123*10 + 4
                                                  */
        }
    }
    
    /*
    * PARTE 3 - INVERTIR DÍGITOS: Invertir dígitos del número ingresado (utilizando recursividad).
    *
    *   Si 
    *       número = 1234
    *   Entonces 
    *       invertido = 4321
    *
    * INDUCCIÓN MATEMÁTICA
    *
    * Si n es un entero y A1,A2,...,Ak los digitos de n donde n = Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0
    * Para k = 1 
    *       n = A1*(10)^0 = A1 = invertirEntero(n)
    *       Por ejemplo, 
    *       Si n = 4 = invertirEntero(4)
    * Suponga que se cumple para el caso k dígitos, probaremos el caso de k+1 dígitos
    *       Caso k es, si
    *           n = Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0
    *           entonces invertirEntero(n) = A1*(10)^(k-1) + ... + Ak-1*(10)^1 + Ak*(10)^0
    *       Por ejemplo, 1234 = 1(10)^3 + 2(10)^2 + 3(10)^1 + 4(10)^0
    *           invertirEntero(1234) = 4(10)^3 + 3(10)^2 + 2(10)^1 + 1(10)^0 = 4321
    * 
    *       Caso k+1 es,
    *           n = Ak+1*(10)^(k) + Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0
    *               Dado invertirEntero(Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0) = invertirEntero(n - Ak+1*(10)^(k))
    *           Entonces 
    *               invertirEntero(n) = A1*(10)^(k-1) + ... + Ak*(10)^1 + Ak+1*(10)^0
    */
    private static int invertirEntero(int num, int invertido){

        if(num == 0){                   //Caso base
            return invertido;
        }else{
            invertido = invertido*10 + num%10;      /* Al multiplicar por 10, se corre una coma a la derecha en resultado y posiciona un cero en el campo de las unidades.
                                                     * Si, invertido = Ak*(10)^(k-1) + ... + A2*(10)^1 + A1*(10)^0
                                                     * entonces, invertido*10= Ak*(10)^(k) + ... + A2*(10)^2 + A1*(10)^1+ 0*(10)^0
                                                     * Por ejemplo, si invertido = 4 entonces invertido*10 = 40
                                                     * Al sumar el módulo, se cambia el cero de las unidades por el residuo de num.
                                                     * Por ejemplo, si del paso anterior invertido = 40 y num = 123 entonces num%123 = 3 y por ende invertido = 40 + 3 = 43
                                                     */
            return invertirEntero(num/10,invertido);
                                                    /*Dado que num debe ir procediendo hacia el caso base, se "corre una coma a la izquierda".
                                                     *Así, al entrar un número decimal como argumento entero, solo pasa la parte entera.
                                                     */
        }
    }
    /*
    * PARTE 5 y 6 - MÁXIMO y MÍNIMO: 
    * 5. Mostrar el número y posición del número mayor dentro del arreglo generado.
    * 6. Mostrar el número y posición del número menor dentro del arreglo generado.
    *
    *   Si
    *       array = {1,2,3,4}
    *   Entonces 
    *       máximo = 4 y mínimo = 1
    *
    * INDUCCIÓN MATEMÁTICA (Caso análogo para Mínimo)
    *
    * Si n es un array y A1,A2,...,Ak los elementos de n, donde n = {A1, A2, ..., Ak}
    * Para k = 1 
    *       n = {A1}, max = A1
    *       Por ejemplo,
    *       Si n = {4} entonces max = 4
    * Suponga que se cumple para el caso k números en el array, probaremos el caso de k+1 números
    *       Caso k es, si
    *           n = {A1, A2, ..., Ak}
    *           index = k-1
    *           entonces max(Ak , max{A1, A2, ..., Ak-1}) = max (n)
    *       Por ejemplo, n = {1,2,3,4} y index = 3
    *           max(4, max(1,2,3)) = max(4,3) = 4 = max(n)
    * 
    *       Caso k+1 es,
    *           n = {A1, A2, ..., Ak, Ak+1} 
    *           index = k
    *           Entonces 
    *           max(n) = max(Ak+1, max {A1, A2, ..., Ak})
    */
    public static int findMax(int[] array, int index) {
        if (index > 0){
            return Math.max(array[index], findMax(array, index-1));
        } else {
            return array[0];
        }
    }
    public static int findMin(int[] array, int index) {
        if (index > 0){
            return Math.min(array[index], findMin(array, index-1));
        } else {
            return array[0];
        }
    }
   /*
    * PARTE 5 y 6 - POSICIONES: 
    *
    *   Si
    *       array = {1,2,3,4}
    *       máximo = 4 
    *   Entonces
    *       posición = 3
    *
    * INDUCCIÓN MATEMÁTICA (Caso análogo para Mínimo)
    *
    * Si n es un array y A1,A2,...,Ak los elementos de n, donde n = {A1, A2, ..., Ak}
    * Para k = 1 
    *       n = {A1}, max = A1
    *       Por ejemplo,
    *       Si n = {4} entonces max = 4
    * Suponga que se cumple para el caso k números en el array, probaremos el caso de k+1 números
    *       Caso k es, si
    *           n = {A1, A2, ..., Ak}
    *           index = k-1
    *           entonces max(Ak , max{A1, A2, ..., Ak-1}) = max (n)
    *       Por ejemplo, n = {1,2,3,4} y index = 3
    *           max(4, max(1,2,3)) = max(4,3) = 4 = max(n)
    * 
    *       Caso k+1 es,
    *           n = {A1, A2, ..., Ak, Ak+1} 
    *           index = k
    *           Entonces 
    *           max(n) = max(Ak+1, max {A1, A2, ..., Ak})
    */
    private static int Posicion(int array[], int limite_inf, int limite_sup,
                               int valor_Buscado)
    {

        if (limite_sup < limite_inf) //Si límite inferior es mayor al superior, no hay rango para poder trabajar la función.
            return -1;
        
        //Si cualquiera de los límites del rango son iguales al valor buscado, devuelva ese límite.
        if (array[limite_inf] == valor_Buscado) 
            return limite_inf;
  
        if (array[limite_sup] == valor_Buscado)
            return limite_sup;
  
        //Dado que cualquier de los límites no es el valor buscado, entonces reducimos el rango por 1 (son enteros, entonces estos pasos discretos estan justificados)
        return Posicion(array, limite_inf + 1, limite_sup - 1, valor_Buscado);
    }
    
   /*
    * PARTE 7 y 8 - PARIDAD: 
    * CONSIDERAMOS EL CERO COMO PAR.
    *
    *   Si
    *       array = {0,1,2,3,4}
    *   Entonces
    *       pares = 3
    *       impares = 2
    *
    * Si n es un array y A1,A2,...,Ak los elementos de n, donde n = {A1, A2, ..., Ak}
    * Para k = 1 
    *       n = {A1}
    *       Dado que un número par es tal que al dividirse por 2, el residuo es cero. O sea, x es par si x = 2*a + 0 para algun a entero.
    *       En otras palabras, x%2 = 0
    *       Similarmente, si el módulo es distinto de cero, Entonces el número no es divisible por 2 y por ende no es par.
    *       Por ejemplo,
    *       Si n = {4} entonces 4 = 2*2 + 0 entonces pares = 1
    */

    public static int Pares(int[] array, int index)
    {
        if (index == array.length){
            return 0;
        }
        int resultado;
        if ((array[index] % 2) == 0) {
            resultado = 1;
        }
        else {
            resultado = 0;
        }
        return resultado + Pares(array, index + 1);
    }
    
    public static int Impares(int[] array, int index)
    {
        if (index == array.length){
            return 0;
        }
        int resultado;
        if ((array[index] % 2) != 0) {
            resultado = 1;
        }
        else {
            resultado = 0;
        }
        return resultado + Impares(array, index + 1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contar_Impares;
    private javax.swing.JButton Contar_Pares;
    private javax.swing.JButton GenerarArray;
    private javax.swing.JButton Invertir;
    private javax.swing.JLabel NumEnteroLabel;
    private javax.swing.JTextField Num_Ent;
    private javax.swing.JButton Num_Mayor;
    private javax.swing.JButton Num_Menor;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel ResultadoArray;
    private javax.swing.JLabel ResultadoArrayLabel;
    private javax.swing.JLabel ResultadoLabel;
    private javax.swing.JButton Sumar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jText_Array;
    // End of variables declaration//GEN-END:variables
}