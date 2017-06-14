package functions;

import storage.List;
import storage.Produkt;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by noah on 14.06.17.
 */
public class FullTableModel extends DefaultTableModel {

        List llist = List.getInstance();
        private ArrayList<Produkt> list = llist.getAll();
        String[] columnNames = {"Name", "Beschreibung", "Hersteller","Anschaffungsdatum", "Art","Zugehoerig","Ausgeliehen"};
        ProdManagement prodmanagement;

        public FullTableModel(){
            prodmanagement = new ProdManagement();
        }





        /**
         * Gibt anhand des Index den Spaltennamen zurück
         * @param col Spalte
         * @return Name der Spalte
         */
        @Override
        public String getColumnName(int col) {
            return columnNames[col].toString();
        }

        /**
         * Gibt den Datentyp der Spalte mit dem übergebenen Index zurück
         * @param columnIndex Spaltenindex
         * @return Datentyp der Spalte
         */
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch(columnIndex) {
                case 0:
                    return String.class;
                case 1:
                    return String.class;
                case 2:
                    return boolean.class;
                case 3:
                    return Date.class;

            }
            return null;
        }

        /**
         * Gibt die Anzahl Zeilen zurück
         * @return Anzahl Zeilen
         */
        @Override
        public int getRowCount() {
            int size = 0;
            if(this.list != null) {
                size = this.list.size();
            }
            return size;
        }

        /**
         * Gibt die Anzahl Spalten zurück
         * @return Anzahl Spalten
         */
        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        /**
         * Gibt an, ob die angegebene Zelle editierbar ist
         * @param row Zeile
         * @param col Spalte
         * @return true, wenn editierbar, false wenn nicht editierbar
         */
        @Override
        public boolean isCellEditable(int row, int col){
            return false;
        }

        /**
         * Gibt den Wert der angegebenen Zelle zurück
         * @param row Zeile
         * @param column Spalte
         * @return Wert der Zelle
         */
        @Override
        public Object getValueAt(int row, int column) {
            if (this.list.size() > row && row >= 0) {
                Produkt object = null;
                object = this.list.get(row);
                switch (column) {
                    case 0:
                        return object.getName(); //int
                    case 1:
                        return object.getDescription(); //Date
                    case 2:
                        return object.getAusgeliehen(); //boolean

                }
            }
            return null;
        }
}
