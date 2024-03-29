package com.usegridlayout;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseGridLayout {

	public static void main(String[] args) {
		JFrame frm = new JFrame("使用网格布局管理器"); //创建窗体，顶层容器JFrame
		
		//创建网格布局管理器，并设置。当容器中组件个数大于网格数时，容器将自动增加一列
		GridLayout gridLayout = new GridLayout(2, 2);
		frm.setLayout(gridLayout);
		
		//创建各组件并添加到容器中
		JLabel label = new JLabel("课程：");
		frm.getContentPane().add(label);
		
		JCheckBox mathsButton = new JCheckBox("高等数学");
		mathsButton.setSelected(true); //设置为默认选项
		frm.getContentPane().add(mathsButton);
		
		JCheckBox englishButton = new JCheckBox("英  语");
		frm.getContentPane().add(englishButton);
		
		//为了对齐，加个空标签
		frm.getContentPane().add(new JLabel());
		
		JCheckBox introductionButton = new JCheckBox("计算机导论");	//JCheckBox：复选框
		frm.getContentPane().add(introductionButton);
		
		JCheckBox programmingButton = new JCheckBox("计算机程序设计");
		frm.getContentPane().add(programmingButton);
		
		frm.setBounds(450, 230, 400, 100);
		frm.setVisible(true);
	}

}
