package Paquetes;
import java_cup.runtime.*;

/*-------CODIGO DE USUARIO-----*/
%%
%public
%class LexerCup
%cupsym Simbolos
%cup   
%char
%column
%line
%full
%ignorecase
%unicode


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
    public String lexema;
%}

%%

/*-------REGLAS LEXICAS------*/
"("               {lexema=yytext(); return new Symbol(Simbolos.ParentesisAper,yycolumn,yyline,yytext());}
")"               {lexema=yytext(); return new Symbol(Simbolos.ParentesisCierre,yycolumn,yyline,yytext());}
{espacio} {/*Ignore*/}
"BORDE"           {lexema=yytext(); return new Symbol(Simbolos.BORDE,yycolumn,yyline,yytext());}
"FILA_INICIO"     {lexema=yytext(); return new Symbol(Simbolos.InicioFila,yycolumn,yyline,yytext());}
"COLUMNA"         {lexema=yytext(); return new Symbol(Simbolos.InicioColumna,yycolumn,yyline,yytext());}
"INICIO_HTML"      {lexema=yytext(); return new Symbol(Simbolos.InicioDocumento,yycolumn,yyline,yytext());}
"ENCABEZADO_INICIO" {lexema=yytext(); return new Symbol(Simbolos.InicioEncabezado,yycolumn,yyline,yytext());}
"TIT"             {lexema=yytext(); return new Symbol(Simbolos.TituloEncabezado,yycolumn,yyline,yytext());}
"ENCABEZADO_FIN"  {lexema=yytext(); return new Symbol(Simbolos.FinEncabezado,yycolumn,yyline,yytext());}
"TABLA_INICIO"    {lexema=yytext(); return new Symbol(Simbolos.InicioTabla,yycolumn,yyline,yytext());}
{numero}          {lexema=yytext(); return new Symbol(Simbolos.Numero,yycolumn,yyline,yytext());}
"FIN_HTML"        {lexema=yytext(); return new Symbol(Simbolos.FinDocumento,yycolumn,yyline,yytext());}
"CUERPO_INICIO"   {lexema=yytext(); return new Symbol(Simbolos.InicioCuerpoDoc,yycolumn,yyline,yytext());}
"CUERPO_FIN"      {lexema=yytext(); return new Symbol(Simbolos.FinCuerpoDoc,yycolumn,yyline,yytext());}
"TABLA_FIN"       {lexema=yytext(); return new Symbol(Simbolos.FinTabla,yycolumn,yyline,yytext());}
"="               {lexema=yytext(); return new Symbol(Simbolos.Igual,yycolumn,yyline,yytext());}
"\""              {lexema=yytext(); return new Symbol(Simbolos.Comillas,yycolumn,yyline,yytext());}
"*"               {lexema=yytext(); return new Symbol(Simbolos.OperadorMultiplicacion,yycolumn,yyline,yytext());}
"+"               {lexema=yytext(); return new Symbol(Simbolos.OperadorSuma,yycolumn,yyline,yytext());}
"-"               {lexema=yytext(); return new Symbol(Simbolos.OperadorResta,yycolumn,yyline,yytext());}
{decimal}         {lexema=yytext(); return new Symbol(Simbolos.NumeroDecimal,yycolumn,yyline,yytext());}
"IMAGEN_INICIO"   {lexema=yytext(); return new Symbol(Simbolos.InicioImagen,yycolumn,yyline,yytext());}
"IMAGEN_FIN"      {lexema=yytext(); return new Symbol(Simbolos.FinImagen,yycolumn,yyline,yytext());}
{correo}          {lexema=yytext(); return new Symbol(Simbolos.Correo,yycolumn,yyline,yytext());}
"FILA_FIN"        {lexema=yytext(); return new Symbol(Simbolos.FinFila,yycolumn,yyline,yytext());}
"\,"              {lexema=yytext(); return new Symbol(Simbolos.Separador,yycolumn,yyline,yytext());}
"\;"              {lexema=yytext(); return new Symbol(Simbolos.PuntoComa,yycolumn,yyline,yytext());}
"\:"              {lexema=yytext(); return new Symbol(Simbolos.DosPunto,yycolumn,yyline,yytext());}
"LISTA_INICIO"    {lexema=yytext(); return new Symbol(Simbolos.InicioLista,yycolumn,yyline,yytext());}
"LISTA_FIN"       {lexema=yytext(); return new Symbol(Simbolos.FinLista,yycolumn,yyline,yytext());}
"PRUEBA"          {lexema=yytext(); return new Symbol(Simbolos.PRUEBA,yycolumn,yyline,yytext());}
"NEGRITA"         {lexema=yytext(); return new Symbol(Simbolos.NEGRITA,yycolumn,yyline,yytext());}
"IMPRIMIR"        {lexema=yytext(); return new Symbol(Simbolos.IMPRIMIR,yycolumn,yyline,yytext());}
"A"               {lexema=yytext(); return new Symbol(Simbolos.Variable,yycolumn,yyline,yytext());}
"ENLACE"          {lexema=yytext(); return new Symbol(Simbolos.ENLACE,yycolumn,yyline,yytext());}
{url}             {lexema=yytext(); return new Symbol(Simbolos.Link,yycolumn,yyline,yytext());}
{texto}           {lexema=yytext(); return new Symbol(Simbolos.Identificador,yycolumn,yyline,yytext());}
. {lexema=yytext(); return new Symbol(Simbolos.error,yycolumn,yyline,yytext());}