package com.usegridlayout;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseGridLayout {

	public static void main(String[] args) {
		JFrame frm = new JFrame("ʹ�����񲼾ֹ�����"); //�������壬��������JFrame
		
		//�������񲼾ֹ������������á��������������������������ʱ���������Զ�����һ��
		GridLayout gridLayout = new GridLayout(2, 2);
		frm.setLayout(gridLayout);
		
		//�������������ӵ�������
		JLabel label = new JLabel("�γ̣�");
		frm.getContentPane().add(label);
		
		JCheckBox mathsButton = new JCheckBox("�ߵ���ѧ");
		mathsButton.setSelected(true); //����ΪĬ��ѡ��
		frm.getContentPane().add(mathsButton);
		
		JCheckBox englishButton = new JCheckBox("Ӣ  ��");
		frm.getContentPane().add(englishButton);
		
		//Ϊ�˶��룬�Ӹ��ձ�ǩ
		frm.getContentPane().add(new JLabel());
		
		JCheckBox introductionButton = new JCheckBox("���������");	//JCheckBox����ѡ��
		frm.getContentPane().add(introductionButton);
		
		JCheckBox programmingButton = new JCheckBox("������������");
		frm.getContentPane().add(programmingButton);
		
		frm.setBounds(450, 230, 400, 100);
		frm.setVisible(true);
	}

}
