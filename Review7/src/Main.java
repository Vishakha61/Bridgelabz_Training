//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
import java.sql.Date;
import java.sql.Time;
public class Main {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String passwd="root";
    public static void main(String[] args) {
        String query1="insert into Doctors values(?,?,?,?,?,?)";
        String q2="insert into Patient values(?,?,?,?,?)";
        String q3="insert into Appointment values(?,?,?,?,?,?)";
        String q4="select * from Appointment where patient_id=1";
        String q5="Select * from Appointment";
        String q6="UPDATE Appointment SET status = ? WHERE patient_id=?";
            try(Connection con=DriverManager.getConnection(url,username,passwd)) {

                //1. ADD DOCTORS
                //  PreparedStatement stmt1=con.prepareStatement(query1);
//                stmt1.setInt(1,4);
//                stmt1.setString(2,"Nikhil");
//                stmt1.setString(3,"Heart Specialized");
//                stmt1.setInt(4,4);
//                stmt1.setInt(5,2000);
//                stmt1.setInt(6,5);
                //int row=stmt1.executeUpdate();

                //2. ADD PATIENT
//                PreparedStatement st2=con.prepareStatement(q2);
//                st2.setInt(1,6);
//                st2.setString(2,"Vanshika");
//                st2.setString(3,"Female");
//                st2.setInt(4,22);
//                st2.setInt(5,9877);
//
//                int row2=st2.executeUpdate();
//                System.out.println(row2);

                //3. BOOK APPOINTMENT

//                PreparedStatement st3=con.prepareStatement(q3);
//                st3.setInt(1,1);
//                st3.setInt(2,1);
//                st3.setInt(3,1);
//                st3.setDate(4, Date.valueOf("2026-07-30"));
//                st3.setTimestamp(5, Timestamp.valueOf("2026-07-30 12:00:00"));
//                st3.setString(6,"Booked");
//                int row3=st3.executeUpdate();
//                System.out.println(row3);

//              4. Searching Appointment by patient id
//               PreparedStatement st4=con.prepareStatement(q4);
//               ResultSet rs=st4.executeQuery();
//                while(rs.next()){
//                    int a_id=rs.getInt("appointment_id");
//                   int d_id=rs.getInt("doctor_id");
//                    int p_id=rs.getInt("patient_id");
//                    Date date=rs.getDate("appointment_date");
//                    Timestamp time=rs.getTimestamp("appointment_time");
//                    String status=rs.getString("status");
//                    System.out.println(a_id+" "+d_id+" "+p_id+" "+date+" "+time+" "+status);
//                }

                //5. DISPLAY APPOINTMENT HISTORY

//                PreparedStatement st5 = con.prepareStatement(q5);
//                ResultSet rs = st5.executeQuery();
//                while(rs.next()){
//                    int a_id=rs.getInt("appointment_id");
//                    int d_id=rs.getInt("doctor_id");
//                    int p_id=rs.getInt("patient_id");
//                    Date date=rs.getDate("appointment_date");
//                    Timestamp time=rs.getTimestamp("appointment_time");
//                    String status=rs.getString("status");
//                    System.out.println(a_id+" "+d_id+" "+p_id+" "+date+" "+time+" "+status);
//                }

//              6. Cancel Appointment
                PreparedStatement st6=con.prepareStatement(q6);
                    st6.setString(1, "Cancelled");
                st6.setInt(2, 1);
                int row=st6.executeUpdate();
                System.out.println(row);
            }
            catch(SQLException e){
                System.out.println("Database Connection Failed");
                e.printStackTrace();
            }
    }
}