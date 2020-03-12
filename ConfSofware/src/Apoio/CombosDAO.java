/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apoio;

import java.sql.ResultSet;
import apoio.ConexaoBD;
import javax.swing.JComboBox;

/**
 *
 * @author pretto
 */
public class CombosDAO {

    ResultSet resultado = null;

//    public void popularCombo(String tabela, JComboBox combo) {
    public void popularCombo(String tabela, JComboBox combo, String campoId, String campoDescricao) {

        combo.removeAllItems();

        ComboItens item = new ComboItens();
        item.setCodigo(0);
        item.setDescricao("Selecione");
        combo.addItem(item);

        try {

//            String sql = "Select * from " + tabela;
            String sql = "Select  " + campoId + ", " + campoDescricao + " from " + tabela + " order by id ASC";

            resultado = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    item = new ComboItens();
                    item.setCodigo(resultado.getInt(1));
                    item.setDescricao(resultado.getString(2));

                    combo.addItem(item);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void popularComboDef(String tabela, JComboBox combo, String campoId, String campoDescricao, String criterio) {

        combo.removeAllItems();

        ComboItens item = new ComboItens();
        item.setCodigo(0);
        item.setDescricao("Selecione");
        combo.addItem(item);

        try {

            String sql = "SELECT " + campoId + ", " + campoDescricao + " from " + tabela + " where " + campoDescricao + " ILIKE '%" + criterio + "%' order by id ASC";

            resultado = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(sql);

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    item = new ComboItens();
                    item.setCodigo(resultado.getInt(1));
                    item.setDescricao(resultado.getString(2));

                    combo.addItem(item);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void definirItemCombo(JComboBox combo, ComboItens item) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (((ComboItens) combo.getItemAt(i)).getCodigo() == (item.getCodigo())) {
                combo.setSelectedIndex(i);
                return;
            }
        }
    }
}
