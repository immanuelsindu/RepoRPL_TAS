
import java.sql.*;
import java.util.*;

public class Connect {
	private String url = "jdbc:sqlite:vizbible.db";
	
	
	public Connection connect() {
		
		Connection conn = null;
		try {
			// create a connection to the database
			conn = DriverManager.getConnection(url);

			System.out.println("Koneksi berhasil.");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		return conn;
	}
	
	//menampilkan semua ayat dari database vizbible.db
	public void viewAllVerses() {
		String sql2 = "SELECT yearNum, osisRef, verseText FROM verses";
		
		try (
				Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql2)
			){
			if(rs.getString("yearNum") != null) {
				//loop through the result set
				System.out.println("\n==============================\nPeriods	Ayat	Isi Ayat");
				while (rs.next()) {
					System.out.println(rs.getString("yearNum") + "\t" + rs.getString("osisRef")+ "\t" + rs.getString("verseText"));	
					}
				System.out.println("\n==============================");
				System.out.println("Seluruh Ayat telah ditampilkan");
				conn.close();
				rs.close();
				}
		}
		
		catch (SQLException e) {
			System.out.println("\n==============================");
			}
		}
	
	//Untuk mencari berdasarkan Periods
	public void searchPeriods(int periods) {
		String sql2 = "SELECT yearNum,events FROM Periods WHERE yearNum =" + periods;
		
		try (Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql2)) {
			
//			System.out.println("Ini adalah rs = "+ rs);
			if(rs.getString("yearNum") != null) {
				// loop through the result set
//				System.out.println("\n==============================\nPeriods Events");
//				while (rs.next()) {
//					System.out.println(rs.getString("yearNum") + "\t" + rs.getString("events"));
//				}
//				System.out.println("\n==============================");
				if(rs.getString("events") != null) {
					JavaTableTerminal jtt = new JavaTableTerminal();
					System.out.println("\nPencarian Berdasarkan Period : "+periods);
					jtt.setHeaders("Periods","Events");
					while(rs.next()) {
						jtt.addRow(rs.getString("yearNum"), rs.getString("events"));
					}
					jtt.print();
				}else {
					JavaTableTerminal jtt = new JavaTableTerminal();
					System.out.println("\nPencarian Berdasarkan Period : "+periods);
					jtt.setHeaders("Periods","Events");
					while(rs.next()) {
						jtt.addRow(rs.getString("yearNum"), "Tidak ada events apapun");
					}
					jtt.print();
				}
				
				
			}else {
				System.out.println("Pencarian Berdasarkan Periode Tidak Ditemukan");
			}
			
			conn.close();
			rs.close();
		} catch (SQLException e) {
//			System.out.println("error:"+e.getMessage());
			System.out.println("\n==============================");
			System.out.println("Pencarian Berdasarkan Periode Tidak Ditemukan\n==============================");
		}
	}
	
	//Untuk mencari berdasarkan Event
	public void searchEvents(String events) {
		try{
			StringParsing kataKunci = new StringParsing(events);
			String sql = "SELECT yearNum, osisRef, verseText FROM verses WHERE ";
//			System.out.println(kataKunci.getKunciParsing());
			String sql2 = sql.concat(kataKunci.getKunciParsing());
			
			//print kueri
			//System.out.println(sql2);
			
			try(Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql2)) {
				
//				System.out.println("===");
//				System.out.println(rs.getString("yearNum"));
//				System.out.println(rs.getString("osisRef"));
//				System.out.println(rs.getString("verseText"));
				
				
//				int cc = 0;
				if(rs.getString("yearNum") != null) {
//					 loop through the result set
					System.out.println("\n==============================\nPeriods	Judul Ayat	Isi Ayat");
					while (rs.next()) {
						System.out.println(rs.getString("yearNum") + "\t" + rs.getString("osisRef")+ "\t" + rs.getString("verseText"));
						
					}
					System.out.println("\n==============================");
					
//					JavaTableTerminal jtt = new JavaTableTerminal();
//					System.out.println("\nPencarian Berdasarkan Events : "+events);
//					jtt.setHeaders("Periods","Judul Ayat","Isi Ayat");
//					while(rs.next()) {
//						jtt.addRow(rs.getString("yearNum"), rs.getString("osisRef"), rs.getString("verseText"));
//					}
//					jtt.print();
					
				}else {
					System.out.println("Pencarian Berdasarkan Events Tidak Ditemukan");
				}
				conn.close();
				rs.close();
			}catch (SQLException e){
				
				System.out.println("\n==============================");
				System.out.println("Pencarian Berdasarkan Events Tidak Ditemukan\n==============================");
			}
		}catch(Exception e) {
			System.out.println("error:"+e.getMessage());
		}
	}	
}
