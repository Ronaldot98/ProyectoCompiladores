/*-------CODIGO DE USUARIO-----*/
package Paquetes;
import static Paquetes.Tokens.*;

%%
%class Lexer
%type Tokens
%public

/*------Expresiones regulares---------*/
espacio=[ \t\r\n]+
digito=[0-9]
letra=[a-zA-Z]
numero={digito}*
decimal={digito}+([\.]{digito}+)
correo={letra}*(\@){letra}*(\.)({letra}{3})(\.)({letra}{2})
texto=[a-zA-Z]+[\s][a-zA-Z]+ | [a-zA-Z]+ 
url=[w]{3}(\.)(\w)+(\.)((\w)+(\W+)(\w+)) | [w]{3}(\.)(\w)+(\.)((\w)+(\W+)(\w+)(\.)(\w+)(\W+)(\w+))



/*-----Declaracion de metodos y variables---------*/
%{
public String Lexema;
%}

%%



/*-------REGLAS LEXICAS------*/
"("               {Lexema=yytext(); return ParentesisAper;}
")"               {Lexema=yytext(); return ParentesisCierre;}
{espacio} {/*Ignore*/}
"BORDE"           {Lexema=yytext(); return BORDE;}
"FILA_INICIO"     {Lexema=yytext(); return InicioFila;}
"COLUMNA"         {Lexema=yytext(); return InicioColumna;}
"INICIO_HTML"      {Lexema=yytext(); return InicioDocumento;}
"ENCABEZADO_INICIO" {Lexema=yytext(); return InicioEncabezado;}
"TIT"             {Lexema=yytext(); return TituloEncabezado;}
"ENCABEZADO_FIN"  {Lexema=yytext(); return FinEncabezado;}
"TABLA_INICIO"    {Lexema=yytext(); return InicioTabla;}
{numero}          {Lexema=yytext(); return Numero;}
"FIN_HTML"        {Lexema=yytext(); return FinDocumento;}
"CUERPO_INICIO"   {Lexema=yytext(); return InicioCuerpoDoc;}
"CUERPO_FIN"      {Lexema=yytext(); return FinCuerpoDoc;}
"TABLA_FIN"       {Lexema=yytext(); return FinTabla;}
"="               {Lexema=yytext(); return Igual;}
"\""              {Lexema=yytext(); return Comillas;}
"*"               {Lexema=yytext(); return OperadorMultiplicacion;}
"+"               {Lexema=yytext(); return OperadorSuma;}
"-"               {Lexema=yytext(); return OperadorResta;}
{decimal}         {Lexema=yytext(); return NumeroDecimal;}
"IMAGEN_INICIO"   {Lexema=yytext(); return InicioImagen;}
"IMAGEN_FIN"      {Lexema=yytext(); return FinImagen;}
{correo}          {Lexema=yytext(); return Correo;}
"FILA_FIN"        {Lexema=yytext(); return FinFila;}
"\,"              {Lexema=yytext(); return Separador;}
"\;"              {Lexema=yytext(); return PuntoComa;}
"\:"              {Lexema=yytext(); return DosPunto;}
"LISTA_INICIO"    {Lexema=yytext(); return InicioLista;}
"LISTA_FIN"       {Lexema=yytext(); return FinLista;}
"PRUEBA"          {Lexema=yytext(); return PRUEBA;}
"NEGRITA"        {Lexema=yytext(); return NEGRITA;}
"IMPRIMIR"        {Lexema=yytext(); return IMPRIMIR;}
"A"                {Lexema=yytext(); return Variable;}
"ENLACE"          {Lexema=yytext(); return ENLACE;}
{url}             {Lexema=yytext(); return Link;}
{texto}           {Lexema=yytext(); return Identificador;}
. {Lexema=yytext(); return error;}




