# TesterRepositoty
Remote Repository Pagos Empleados

PagoEmpleado

  What is it?
  -----------

  Employee Payment allows you to calculate the total that the company must pay an employee, based on the hours
  worked and the times during which she worked. The solution is developed in java language.
  The following abbreviations will be used for data entry:
  MO: Monday
  TU: Tuesday
  WE: Wednesday
  TH: Thursday
  FR: Friday
  SA: Saturday
  SU: Sunday
  The entry is the name of an employee and the schedule they worked, indicating the time and hours. This must be a
   .txt file with at least five data sets. An example file is attached and can be used to test the program.

  The text file is called file_hour.txt. The entire exercise must be run in the same directory where it is downloaded
  the solution from github.

  The solution validates that the data is entered in the following format:
  ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

  In the case of not being with the indicated format, the program will indicate which line will not be processed for 
  the calculation:
    Payment for each employee.
    It also validates that the hours are numbers.

   Architecture
   ------------
   PagoEmpleado Class: Where the process starts.
   Empleados Class: To instantiate each employee and his attributes.
   Validar Class : Validates that abbreviations and input data formats are respected from the txt file.
   CalculaPago Class: Allows the calculation of the total payments for each employee based on the schedules.

   Object-oriented development is focused and under the xp methodology (it allows to have fewer lines of code and tests
   unitary).

  Documentation
  -------------

  The most up-to-date documentation can be found at https://github.com/cboxes/TesterRepositoty.


  System Requirements
  -------------------

  JDK:
    1.7 or above (this is to execute Maven - it still allows you to build against 1.3
    and prior JDK's).
  Memory:
    No minimum requirement.
  Operating System:
    Windows:
      Windows 10 or above.
      No minimum requirement.
  mockito-all-2.0.2-beta.jar
    To download the latest version of Mockito from Maven Repository click in.
    http://mvnrepository.com/artifact/org.mockito/mockito-all/2.0.2-beta


   Run the program
   --------------------

   Download the package from the url:
   On your local computer create a folder of your choice. Example c:\Solution
   Inside this created folder copy the downloaded files.
   Go to windows explorer and type "cmd" to open a command prompt.
   1) Compile the java files as follows:
     C:\Solucion\javac Validar.java CalculaPago.java Empleados.java PagoEmpleado.java PagoEmpleadoTester.java
     and then press <Enter>.
   2) Run the following:
      java PagoEmpleado

   C:\Solution>java PagoEmpleado
   The amount to pay RENE is: 100.0 USD
   The amount to pay ASTRID is: 60.0 USD
   The amount to pay SAUL is: 85.0 USD
   The amount to pay BRAT is: 105.0 USD
   The amount to pay MICTHE is: 60.0 USD

   Unit tests
   -----------------

   Run the following:
      java --add-opens java.base/java.lang=ALL-UNNAMED PagoEmpleadoTester

   The output should be:
                       pass
