<h1><strong>Proyecto basico Java + Junit + Maven + Jenkin y Notificacion Email + GitHub</strong></h1>
<p>&nbsp;</p>

<p>En este proyecto se encuentran las siguiente clases:</p>
<p><strong>Principal</strong>: esta clase contiene el metodo main el cual ejecutara el codigo que se encuentra en las clases Adicion, Extraccion, Division y Multiplicacion</p>
<p><strong>Adicion</strong>: Esta clase contiene el metodo suma el cual retorna un valor entero resultado de la suma de dos numeros enteros que recibe como parametros de entrada.</p>
<p><strong>Extraccion</strong>: Esta clase contiene el metodo resta el cual retorna un valor entero resultado de la resta de dos numeros enteros que recibe como parametros de entrada.</p>
<p><strong>Multiplicacion</strong>: Esta clase contiene el metodo multiplicacion el cual retorna un valor entero resultado de la multiplicacion de dos numeros enteros que recibe como parametros de entrada.</p>
<p><strong>Division</strong>: Esta clase contiene el metodo Division el cual retorna un valor entero resultado de la Division de dos numeros enteros que recibe como parametros de entrada y se encuentra una validacion basica en caso de enviar el divisor sea 0.</p>
<p>&nbsp;</p>
<h2><strong>Pruebas Unitarias</strong></h2>
<p>Se crea una clase JUNIT la cual contiene las pruebas unitarias para los metodos suma, resta, division, multiplicacion se utilizan los siguientes @Tags por practica:</p>
<p><strong>@BeforeClass:</strong> sirve para ejecutar una sola vez codigo antes de iniciar todas las pruebas (Solo se ejecuta una vez)</p>
<p><strong>@Before:</strong> Sirve para ejecutar codigo antes de ejecutar cada prueba @Test.</p>
<p><strong>@Test:</strong> Este tag indica que el metodo creado es una prueba unitaria.</p>
<p><strong>@After:</strong> Sirve para ejecutar codigo despues de ejecutar cada prueba @Test.</p>
<p><strong>@AfterClass:</strong> Sirve para ejecutar codigo una sola vez despues de ejecutar todas las pruebas (Solo se ejecuta una vez).</p>
<p><strong>@Ignore:</strong> Sirve para ignorar una prueba.</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<h2>MAVEN</h2>
<p>En este caso se utiliza principalmente para la ejecucion en Jenkins el cual tiene mayor de facilidar de acopio desde un proyecto Maven.</p>
<p>&nbsp;</p>
<h2>GITHUB</h2>
<p>Se utiliza para el versionamiento de codigo y para que al momento de realizar un cambio en el codigo , el servidor Jenkins inicie con la ejecucion automatica de las pruebas.</p>
<p>&nbsp;</p>
<h2>JENKINS</h2>
<p>Es el servidor el cual tiene plugins que nos ayudan para la ejecucion automatica de las pruebas unitarias, entre otras....&nbsp;</p>
<p>&nbsp;</p>
