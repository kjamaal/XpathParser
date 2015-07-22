package org.kirkplace.xpath;

import java.awt.*;
import javax.swing.*;
import javax.xml.xpath.XPathExpression;

import java.awt.event.*;
import org.w3c.dom.*;

public class XpathGui {

	private JFrame frame;
	private Xpath result = new Xpath();
	private JTextField txtXpathExpr;
	private JTextArea txtXmlFile;
	private JTextArea txtResult;
	private JButton btnEvaluate;
	private NodeList results;
	private XPathExpression xpathExpr;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XpathGui window = new XpathGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public XpathGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(635, 543));
		frame.setBounds(100, 100, 635, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel rootPanel = new JPanel();
		rootPanel.setAutoscrolls(true);
		rootPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		rootPanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		frame.getContentPane().add(rootPanel, BorderLayout.CENTER);
		rootPanel.setLayout(new BorderLayout(10, 0));
		
		JPanel textPanel = new JPanel();
		rootPanel.add(textPanel, BorderLayout.CENTER);
		textPanel.setLayout(new GridLayout(0, 2, 10, 0));
		
		JScrollPane scrollPaneXmlFile = new JScrollPane();
		scrollPaneXmlFile.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPaneXmlFile.setAutoscrolls(true);
		textPanel.add(scrollPaneXmlFile);
		
		txtXmlFile = new JTextArea();
		scrollPaneXmlFile.setViewportView(txtXmlFile);
		txtXmlFile.setDragEnabled(true);
		txtXmlFile.setTabSize(3);
		txtXmlFile.setText("[Paste XML]");
		
		JScrollPane scrollPaneResult = new JScrollPane();
		textPanel.add(scrollPaneResult);
		
		txtResult = new JTextArea();
		scrollPaneResult.setViewportView(txtResult);
		txtResult.setTabSize(3);
		txtResult.setText("[Result]");
		
		JPanel controlPanel = new JPanel();
		rootPanel.add(controlPanel, BorderLayout.NORTH);
		
		JLabel lblXpathExpr = new JLabel("Xpath Expression");
		controlPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		controlPanel.add(lblXpathExpr);
		
		JPanel textFieldSubPanel = new JPanel();
		textFieldSubPanel.setPreferredSize(new Dimension(400, 22));
		controlPanel.add(textFieldSubPanel);
		textFieldSubPanel.setLayout(new BorderLayout(0, 0));
		
		txtXpathExpr = new JTextField();
		textFieldSubPanel.add(txtXpathExpr, BorderLayout.NORTH);
		txtXpathExpr.setColumns(10);
		
		btnEvaluate = new JButton("Evaluate");
		controlPanel.add(btnEvaluate);
		btnEvaluate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnEvaluate){
					if((!txtXpathExpr.getText().matches("")) && (!txtXpathExpr.getText().matches("Please enter an Xpath expression"))){
						if(!txtXmlFile.getText().matches("")){
						try {
							xpathExpr = result.buildXpath(txtXpathExpr.getText());
							results = result.getNodeNameAndValue(result.buildDoc(txtXmlFile.getText()), xpathExpr);
							if(results.item(0) == null || results.getLength() == -1){
								txtResult.setText("No child or text nodes");
							}else{
								if(results.getLength()>=0 && results.item(0).hasChildNodes()){
									for(int i = 0;i<results.getLength();i++){
										txtResult.setText(results.item(i).getLocalName() + "\n");
										NodeList nodes = results.item(i).getChildNodes();
										if(nodes.item(0) != null){
											for(int e2 = 0;e2<nodes.getLength();e2++){
												if(!nodes.item(e2).getNodeName().matches("#text")){
												txtResult.append("\t" + nodes.item(e2).getChildNodes() + "\n");
												}
											}	
										}else{
											txtResult.setText("empty child node");
										}
									}
								}else{
									if(results.item(0).getNodeName().matches("#text")){
										txtResult.setText(results.item(0).getTextContent());
									}
								}
							}
						}catch (Exception e2) {
							txtResult.setText("The xpath expression is invalid.");
						}}else{
							txtXpathExpr.setText("Please enter valid XML in left pane");
							txtResult.setText("");
						}
						}else{
							txtXpathExpr.setText("Please enter an Xpath expression");
							txtResult.setText("");
						}
					}}});

		JRootPane rootPane = frame.getRootPane();
		rootPane.setDefaultButton(btnEvaluate);
	}
}