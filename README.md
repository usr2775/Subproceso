CALCULO DE VOCALES 

Este proyecto es una aplicación que cuenta las vocales (aeiou) en un archivo de texto llamado "lorem_ipsum.txt". Está organizado en varios paquetes y clases:

- net.salesianos.Main: El punto de entrada de la aplicación. Carga las líneas del archivo, inicia procesos para contar vocales, espera a que los procesos finalicen y muestra los resultados.
- net.salesianos.utils.Utils: Contiene métodos para cargar líneas desde un archivo y obtener el recuento de vocales desde un archivo de salida.
- net.salesianos.processes.VowelCounter: Un programa independiente que cuenta las vocales en un texto.
- net.salesianos.launcher.ProcessLauncher: Inicia procesos que ejecutan VowelCounter y obtiene los recuentos de vocales desde archivos de salida.


Clase Main:

- La clase Main: Aquí esta el flujo principal

- Carga del archivo de texto: Utiliza el método getAllLines del paquete net.salesianos.utils para cargar todas las líneas del archivo "lorem_ipsum.txt" en un ArrayList llamado lines.
- Inicio de procesos para contar las vocale Utiliza un bucle for para iniciar procesos separados que cuentan las vocales 'a', 'e', 'i', 'o' y 'u'. Estos procesos se inician utilizando la clase ProcessLauncher y se almacenan en una lista llamada allProcesses.
- Espera a que todos los procesos finalicen: Utiliza un bloque try-catch para esperar a que todos los procesos en allProcesses finalicen mediante el método waitFor.
- Impresión del texto completo: Imprime todas las líneas del archivo "lorem_ipsum.txt".
- Cálculo del número total de vocales: Utiliza un segundo bucle for para obtener el recuento de cada vocal y calcular el número total de vocales.
- Eliminación de archivos de salida: Elimina archivos de salida generados durante el proceso.

Clase Utils:

La clase Utils contiene métodos de utilidad para cargar líneas desde un archivo y obtener el recuento de vocales desde un archivo de salida.

- getAllLines: Carga todas las líneas de un archivo y las almacena en un ArrayList.
- getTotalCountFromFile: Obtiene el recuento de vocales desde un archivo de salida.

Clase VowelCounter: 

- La clase VowelCounter Se utiliza para contar las vocales

Clase ProcessLauncher:

La clase ProcessLauncher contiene métodos para iniciar procesos que cuentan las vocales en el texto.

- startVowelCountProcess: Inicia un proceso que ejecuta la clase VowelCounter para contar las vocales en un texto.
- getVowelCount: Obtiene el recuento de vocales desde un archivo de salida generado por un proceso.






