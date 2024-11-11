# TAREA 29 
Expresión Lambda que elimine espacios, comas y puntos de una frase y además la devuelva la frase convertida en mayúscula.

# TAREA 30
Para la tarea se pide como requerimiento escribir una expresión lambda que cuenta la cantidad de veces que se repiten las palabras de una frase y devuelva la mas repetida, según lo siguiente:

La expresión lambda debe recibir por argumento una frase u oración y devolver un objeto Map que contenga la palabra mas repetida de la frase como llave y la cantidad de veces que se repite como valor.

Tiene que devolver un objeto Map de java, por ejemplo usando la forma clásica:

Map<String, Integer> resultado = new HashMap();
resultado.put(palabra, max);
return resultado;
o bine usar el helpers abreviado y equivalente:

return Collections.singletonMap(palabra, max)

Mostrar el resultado en consola iterando el map o bien obteniendo el primer elemento con get().
