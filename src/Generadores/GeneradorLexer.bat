
SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_111\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Ronal\Documents\NetBeansProjects\Proyecto_Compiladores\src\Paquetes
java -jar %JFLEX_HOME% C:\Users\Ronal\Desktop\Fuentes\jflex-1.6.1.jar Lexer.flex
pause
