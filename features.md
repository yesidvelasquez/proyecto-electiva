II.	DEFINICION GENERAL DEL PROYECTO


A.	IDEA GENERAL


Permitir que una empresa publica o privada pueda realizar el tramite de pagos y/o revisión de informes de actividades de las personas que allí trabajan de una forma mas eficientes y con posibles menos errores al momento de la revisión y retroalimentación a las personas que presentan su cuenta de cobro o informe de actividades 
 
B.	FUNCIONALIDAD PRINCIPAL 




Al momento de ingresar a la empresa o entidad le asignan unas credenciales institucionales, entre estas credenciales esta un correo institucional, obtener estas credenciales sin el primer paso para acceder al programa ya que mediante el correo institucional la persona al ingresar al programa debe crear un usuario con este correo institucional, para esto el programa le pedirá:

•	Nombre completo 

•	Correo institucional

•	Clave

•	Confirmar clave

•	Cedula 

•	Celular 





Luego  crear el usuario el programa le enviara un correo para autenticar el correo, mientras en el programa se le abre una ventana donde debe poner un código enviado a al correo, después de poner el código de seguridad en la ventana de forma correcta, el programa le muestra una ventana donde dice que el usuario se ha creado de manera correcta y lo dirige a inicio de sesión  al ingresar al programa lo dirige a una ventana diferente dependiendo el rol asignado, este rol lo asigna el operador del gasto este usuario del operador del gasto ya debe venir creado por defecto en la base de datos con todos los permisos del programa, los usuarios permitidos son:

•	Contratista

•	Planta 

•	Apoyo a la supervisión 

•	Ordenador del gasto 





el contratista solo le permitirá cargar documentos, 3 archivos en pdf como máximo donde estaría dividido como 


•	Hoja remisoria

•	Informe certificado y documento de verificación del certificado 

•	Documentación de verificación de actividades 





Y le permitirá enviar este pago a un apoyo a la supervisión también asignado previamente por el ordenador del gasto, este la enviar al apoyo a la supervisión para que sea revisado, aprobado y firmado, en caso de no estar bien el pago él apoyó a la supervisión lo devolverá la contratista



El de planta solo le permitirá cargar documentos, 2 archivos en pdf como máximo donde estaría dividido como 


•	Hoja remisoria

•	Informe y Documentación de verificación de actividades 


Y le permitirá enviar este informe a un apoyo a la supervisión también asignado previamente por el ordenador del gasto, este la enviar al apoyo a la supervisión para que sea revisado, aprobado y firmado, en caso de no estar bien el pago el apoyo a la supervisión lo devolverá al funcionario de planta 


Apoyo a la supervisión le permitirá cargar documentos, 3 archivos en pdf como máximo donde estaría dividido como 


•	Hoja remisoria

•	Informe certificado y documento de verificación del certificado 

•	Documentación de verificación de actividades 



En caso de ser contratista, en caso de ser de planta 


•	Hoja remisoria

•	Informe y Documentación de verificación de actividades 


Para este permitirá enviar este informe al ordenador del gasto que es quien hace de apoyo a la supervisión, también asignado previamente por el ordenador del gasto, este la enviar al apoyo a la supervisión para que sea revisado, aprobado y firmado, en caso de no estar bien el pago el ordenador del gasto lo devolverá al funcionario de planta o contratista que hace de apoyo a la supervisión 


Además de esto estos tienen una bandeja donde les permite ver las cuentas de cobro o informes que los contratistas o empleados de planta hayan subido, esto para que les haga la revisión, aprobación y posterior firma para pago, después de aprobar las cuentas de los contratistas y los informes de los de planta, las firman y las envían al ordenador del gasto 


El ordenador del gasto, este usuario hace de super usuario en el programa ya que es aquel que tiene la posibilidad de recuperar usuarios borrar cuentas de cobro que este mal o hayan sido enviadas más de una vez, también es el encargado de asignar los roles a los usuarios registrados, este también está en disposición de crear más roles, el interfaz para este rol esta dividió en una bandeja para cada apoyo a la supervisión, donde llegaran las cuentas aprobadas por este apoyo, y tendrá una bandeja aparte donde le llegaran las cuentas de cobro o informes de los apoyos a la supervisión, donde el ordenador del gasto es quien los supervisa.


C.	PROPOSITO 

El propósito de este programa es mejorar la calidad de los procesos de pago de las empresas publicas y privadas, haciendo más eficientes los diferentes procesos que conllevan las cuentas de cobro.



III.	OBJETIVO GENERAL

Mejorar la calidad de los procesos de pago de las empresas ya sean públicas o privadas haciendo más eficientes los procedimientos que llevan realizar los pagos y realizar así mismo un mejor control de los pagos 


A.	OBJETIVOS ESPECIFICOS

•	Hacer mas eficiente los procedimientos de los pagos, llevando a que estos procedimientos lleguen a tardar la mitad del tiempo que hoy se pueden tardar por proceso 

•	Obtener estadísticas sobre los pagos y los informes que las personas radicaron.


•	Realizar los pagos a los contratistas de forma más rápida 




B.	JUSTIFICACION

La razón para realizar este proyecto es debido a la falta de garantías que tiene los contratistas en las empresas al momento de obtener los honorarios correspondientes por el trabajo realizado, esto muchas veces se debe a que los procesos de pago aparan ellos son muy tardados, en algunos casos hasta 1 mes después de radicados los informes por parte de los contratistas, para esto se realiza este programa para mejorar el proceso de pago de las cuentas de cobro de los contratistas 


IV.	ESPECIFICACION DE REQUERIMIENTOS



A.	REQUERIMIENTOS 


1.	Permite realizar el cargue de archivos en pdf y posterior edición por parte de quien lo revisa


2.	El programa debe permitir registrar una única firma por usuario


3.	Debe mostrarme una lista de las cuentas de cobro o informes de actividades que fueron validados y están listos para ser pagos 


4.	Debe permitir revisar estadísticas de devoluciones de cuentas, como cuantas veces las devolvieron, porque se devolvieron además de permitirme ver quien no subió cuenta de cobro o informe 


5.	Debe permitirse enviar las cuentas de cobro o informes de actividades entre los usuarios así cuenten con diferentes roles


6.	El programa debe permitirme asignar roles y crear usuarios 



                Roles: 	contratista 
		
		Planta 
		
		apoyo supervisión 
		
	     	Ordenador del gasto
		




B.	ALCANCE 

El programa funciona hasta que el área encargada, o el ordenador del gasto, descargue la plantillas en Excel, donde les informan las cuentas de cobro a las cuales se les pueden pagar, cuentas que quedaron aprobados por todos los departamentos incluyendo apoyos a la supervisión y ordenadores del gasto 

C.	LIMITACIONES DE LA IMPLEMENTACION


•	la falta de tiempo para desarrollar todos los requerimientos 

•	el programa será una aplicación móvil no servirá (por ahora) en la web 

•	aquel contratista o funcionario que no cuente con correo institucional no podrá usar el programa 


D.	RESTRICCIONES

Para ver las restricciones lo haremos por requerimientos, de acuerdo a lo que se va a desarrollar

•	Requerimiento 1- para el cargue de los archivos pdf y su posterior edición el programa debe permitirme descargar el archivo, para revisarlo y hacerle ediciones, posterior mente cargar el documento revisado y con lo que debe corregir, este va a reemplazar el documento anterior cargado por el contratista, el programa solo permitirá cargar 2, 3 pdf dependiendo de el rol, si es de planta solo cargara 2 archivos pdf como máximo y si es contratista 3 archivos pdf, estos pdf no deben pesar mas de 4 megas cada uno, los archivos pdf como nombre no pueden pasar de 20 caracteres 


•	Requerimiento 5 - el programa solo le puede permitir al contratista enviarle el archivo de la cuenta de cobro a el apoyo a la supervisión que le asignaron, no puede mostrar todos los apoyo a la supervisión que estén en la empresa, igual mente para los apoyos a la supervisión no pueden enviarse las cuentas de los contratistas o los informes de los de planta entre ellos los apoyos a la supervisión solo pueden envíales archivos a los que supervisan y al ordenador del gasto, el ordenador del gasto debe poder eliminar cuentas modificar cuentas en caso de el encontrar aun error en la cuenta, debe permitir devolver la cuenta al apoyo a la supervisión, aunque el tiene todos los permisos en el programa debe aplicarse una restricción en caso de que quiera enviar una cuenta a el  contratista y no al apoyo a la supervisión ya que esta generaría desorden 


•	Requerimiento 6 – el programa permite crear usuarios para esto solicita al usuario:


o	Nombre completo 

o	Correo institucional

o	Clave

o	Confirmar clave

o	Cedula 

o	Celular 



RESTRICCIONES


•	Para el nombre no se permite que tenga más de 43 caracteres

•	El correo debe ser institucional, no permite @gmai.com, @hotmail.com, @outlook.com, o correos con escritura rara, ejemplo un dominio “xcxcxcxc” o “dfdgrgdg”

•	La clave debe tener caracteres numéricos y alfabetitos mínimo una letra en mayúscula y de mínimo 6 caracteres de largo 

•	La cedula debe tener 4, 5, 6, 7, 10, caracteres 

•	El celular debe tener 10 caracteres no se acepta teléfonos fijos 


 
V.	ARBOL DE REQUISISTOS

![arbol de requisitos](https://user-images.githubusercontent.com/100253836/188780176-075dee6e-dded-472d-9306-59c991db6613.png)

  



VI.	PREGUNTAS 
El tipo de publico al que se enfoca este programa son personas que actual mente estén trabajando, ya sea en empresa pública o privada, especialmente que tenga personas contratadas con el contrato de prestación de servicios, los clientes será  empresas que tengan mucho personal contratado como prestación de servicios y vean que tienen la falencia en el proceso de pago de los contratistas, el Arango de edad de las personas es independiente ya que al estar en la empresa deberá usar el programa, igual se espera que la persona tenga un mínimo en conocimiento de uso de los dispositivos móviles 



VII.	RAZON DE SER

A.	VALOR EN EL MERCADO 
En el mercado estas propuestas tienen un amplio valor ya que en las empresas una de sus principales molestias son los contratistas y las quejas o PQR que ellos interponen debido a las altas demoras en el trámite de las cuentas de cobro y si lo llevamos a un punto mas enfocado, hay entidades que los miden de acuerdo con los pagos que realicen por lo que una demora en el pago es negativa parta la entidad



B.	SOLUCIONES SIMILARES
SECOP II


VIII.	DIAGRAMAS UML

A.	DIAGRAMA DE CASO DE USO POR ROL

   ![diagrama de rol 1](https://user-images.githubusercontent.com/100253836/188780264-3015dffa-d46a-4588-bad9-5046abaa66f5.png)
   
 ![diagrama de rol 2](https://user-images.githubusercontent.com/100253836/188782218-89cd8aea-b3a0-4470-b990-2a49f5cc9d79.png)
 
![diagrama de rol 3](https://user-images.githubusercontent.com/100253836/188782086-2d28263b-7375-467d-b73e-2cd149fb664d.png)




 
B.	TABLA DE ROLES 
    
 
![tabla de roles](https://user-images.githubusercontent.com/100253836/188780240-520d4173-705e-4eb5-990f-456397024ced.png)

