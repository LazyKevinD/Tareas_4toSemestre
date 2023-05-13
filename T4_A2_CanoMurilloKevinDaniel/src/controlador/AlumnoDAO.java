package controlador;
import ConexionBD.ConexionBD;
import modelo.Alumno;
public class AlumnoDAO {
    //Metodos ABCC (CRUD)------------------------------------------------------------------------
    ConexionBD conexion = new ConexionBD();
    //ALTAS--------------------------------------------------------------------------------------
    public boolean agregarAlumno(Alumno a){
        boolean res = false;
       /*
       PROCESO DE ALTAS EN MySQL

            INSERT INTO alumnos values("01", "Luke", "Skywalker", "-", 50, 10, 'ISC');

        String sql1 = "INSERT INTO alumnos values(\"01\", \"Luke\", \"Skywalker\", \"-\", 50, 10, \"ISC\");";
        String sql2 = "INSERT INTO alumnos values('01', 'Luke', 'Skywalker', '-', 50, 10, 'ISC');";
        String sql3 = "INSERT INTO alumnos values(\"01\", 'Luke', 'Skywalker', \"-\", 50, 10, 'ISC');";

        */

        String sql = "INSERT INTO alumnos values(\""+a.getNumControl()+"\", \""+a.getNombre()+"\", \""+a.getPrimerAp()+"\", \""+a.getSegundoAp()+"\", "+a.getEdad()+", "+a.getSemestre()+", \""+a.getCarrera()+"\");";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }
    //BAJAS--------------------------------------------------------------------------------------
    public boolean eliminarAlumno(String numControl){
        boolean res = false;

        //DELETE FROM Alumnos WHERE NumControl = '01';
        String sql = "DELETE FROM alumnos WHERE NumControl = '" + numControl  + "'";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }

    //CAMBIOS------------------------------------------------------------------------------------

    public boolean actualizarAlumno(Alumno a){
        boolean res = false;

        //UPDATE alumnos SET Nombre='x', PrimerAp='x', Edad=0, Semestre=0, Carrera='x' WHERE NumControl='2';
        String sql = "UPDATE alumnos SET Nombre='"+ a.getNombre() +"'," +
                " PrimerAp='"+ a.getPrimerAp() +"'," +
                " SegundoAp='"+ a.getSegundoAp() +"'," +
                " Edad="+ a.getEdad() +"," +
                " Semestre="+ a.getSemestre() +"," +
                " Carrera='"+ a.getCarrera() +"' WHERE NumControl='"+a.getNumControl()+"'";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }

    //CONSULTAS----------------------------------------------------------------------------------

}
