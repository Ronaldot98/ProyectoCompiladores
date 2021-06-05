SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_111\bin"
SET PATH =%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Ronal\Documents\NetBeansProjects\Proyecto_Compiladores\src\Paquetes
java -jar C:\Users\Ronal\Desktop\Fuentes\java-cup-11b.jar -parser Sintactico -symbols Simbolos  sintactico.cup
pause

