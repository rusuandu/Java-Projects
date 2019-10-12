
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class SortandFilter {

        public static void filtrareNrFix () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.filtrareNrFix();
        
        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
        public static void filtrareNrMobil () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.filtrareMobil();
        
        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
        
    public static void filtrareLunaCurenta () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.filtrareLunaCurenta();
        
        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
    
        public static void filtrareZiCurenta () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.filtrareZiCurenta();
        
        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
        
    public static void ordonareNume () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.contactList();
        Collections.sort(cList, new Comparator<contactPrivate>() {
		@Override
		public int compare(contactPrivate o1, contactPrivate o2) {
			return o1.getFnume().compareTo(o2.getFnume());
		}
	});

        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
         public static void ordonarePrenume () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.contactList();
        Collections.sort(cList, new Comparator<contactPrivate>() {
		@Override
		public int compare(contactPrivate o1, contactPrivate o2) {
			return o1.getLnume().compareTo(o2.getLnume());
		}
	});
        
        
        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
          public static void ordonareNrTf () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.contactList();
        Collections.sort(cList, new Comparator<contactPrivate>() {
		@Override
		public int compare(contactPrivate o1, contactPrivate o2) {
			return o1.getPhone().compareTo(o2.getPhone());
		}
	});
        
        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
          public static void ordonareData () {
        ContactQuery cq = new ContactQuery();
        ArrayList<contactPrivate> cList = cq.contactList();
        Collections.sort(cList, new Comparator<contactPrivate>() {
		@Override
		public int compare(contactPrivate o1, contactPrivate o2) {
			return o1.getBdate().compareTo(o2.getBdate());
		}
	});
        
        String[] colNames = {"Id","Nume", "Prenume", "DataNasterii", "Sex", "NumarDeTelefon", "TipTelefon" };
        Object[][] rows = new Object[cList.size()][7];
        
        for(int i=0; i<cList.size(); i++) {
                rows[i][0] = cList.get(i).getCid();
                rows[i][1] = cList.get(i).getFnume();
                rows[i][2] = cList.get(i).getLnume();
                rows[i][3] = cList.get(i).getBdate();
                rows[i][4] = cList.get(i).getSex();
                rows[i][5] = cList.get(i).getPhone();
                rows[i][6] = cList.get(i).getTipTel();
        }
        MyModel mmd = new MyModel(rows,colNames);
        AdminContacte.jTable1.setModel(mmd);
    }
}
