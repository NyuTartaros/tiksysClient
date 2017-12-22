package com.nyu.tiksysclient.table;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class CancelSeatButtonRenderer extends JButton implements TableCellRenderer {
    /**
	 * 
	 */
	private static final long serialVersionUID = 901721317826770297L;

	public JComponent getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
        //value Դ��editor
        //String text = (value == null) ? "" : value.toString();
		if(value.equals(true)){
			setText("�˶�");
		}else{
			setEnabled(false);
			setText("���˶�");
		}
        //��ť����
        //setText(text);
        //if(text.equals("full") || text.equals("canceled")){
      	//  setEnabled(false);
        //}
        //��Ԫ����ʾ
        //setToolTipText(text);
        //����ɫ
        //setBackground(Color.BLACK);
        //ǰ��ɫ
        //setForeground(Color.green);
		return this;
    }
}