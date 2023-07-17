
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mypro extends JFrame implements ActionListener {
    // JButton button = new JButton();
    JButton searchButton;

    mypro() {
        // ---------------------------FIRST
        // INTERFACE---------------------------------------------------------------

        this.setTitle("HomeSphere");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // get screen size
        this.setSize(screenSize);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon icon = new ImageIcon("D:\\real-estate-office\\real-estate-office\\src\\logo.jpg"); // use forward
                                                                                                     // slash instead of
                                                                                                     // backward slash
                                                                                                     // for
        // the file path
        this.setIconImage(icon.getImage());

        ImageIcon imu = new ImageIcon("D:\\real-estate-office\\real-estate-office\\src\\image2.jpg");
        Image image = imu.getImage();
        Image scaledImage = image.getScaledInstance(screenSize.width, screenSize.height, image.SCALE_SMOOTH);
        imu = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(imu);
        imageLabel.setBounds(0, 0, screenSize.width, screenSize.height); // set the image size to the screen size

        JLabel textLabel = new JLabel("HOMESPHERE");
        textLabel.setFont(new Font("Abril Fatface", Font.BOLD, 120));
        textLabel.setBounds(screenSize.width / 2 - 430, 50, 900, 150); // change bounds to center and expand height
        textLabel.setHorizontalAlignment(JTextField.CENTER);
        textLabel.setForeground(new Color(0, 204, 0)); // change color to green

        // ------------------------------------------------------------------------------------------------------------------

        searchButton = new JButton("Search Properties");
        searchButton.setFont(new Font("Arial", Font.BOLD, 24));
        searchButton.setSize(300, 50);
        searchButton.setLocation(screenSize.width / 2 - 170, screenSize.height / 2 - 270);
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Filter.main(new String[] {});
                // this.dispose();
            }
        });// add ActionListener to handle button clicks

        // Add panel of color white
        // --------------------------------------------------------------------------------------------------------------------------------
        JPanel adminpanel = new JPanel();
        // adminpanel.setBackground(new Color(255, 191, 128));
        adminpanel.setBounds(screenSize.width / 2 - 850, screenSize.height / 2 - 100, 300, 400);
        adminpanel.setOpaque(false);

        JLabel textLabeladmin = new JLabel("Admin Login");
        textLabeladmin.setFont(new Font("Abril Fatface", Font.BOLD, 50));
        textLabeladmin.setBounds(23, 23, 20, 20); // change bounds to center and expand height
        textLabeladmin.setForeground(new Color(0, 204, 0)); // change color to green
        // textLabeladmin.setBackground(new Color(0, 0, 255));
        adminpanel.add(textLabeladmin);

        ImageIcon imageIcona = new ImageIcon("D:\\real-estate-office\\real-estate-office\\src\\admin.png");
        Image imagea = imageIcona.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH); // resize image
        ImageIcon scaledIcon = new ImageIcon(imagea); // create new ImageIcon with the resized image
        JLabel imageLabeladmin = new JLabel(scaledIcon);
        imageLabeladmin.setBounds(45, 45, 60, 60); // set new size for JLabel
        adminpanel.add(imageLabeladmin);

        JButton adminloginButton = new JButton("Login");
        adminloginButton.setFont(new Font("Arial", Font.BOLD, 24));
        adminloginButton.setBounds(20, 200, 260, 50); // set bounds to (x, y, width, height)
        // adminloginButton.setBounds(55, 95, 15, 15);
        adminpanel.add(adminloginButton);
        // adminloginButton.addActionListener(this); // add ActionListener to handle
        // button clicks

        adminloginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Adminloginform.main(new String[] {});
                // this.dispose();
            }
        });

        // ------------------------------------------------------------------------------------------------------------------------

        JPanel agentpanel = new JPanel();
        // agentpanel.setBackground(new Color(255, 230, 204));
        agentpanel.setBounds(screenSize.width / 2 - 400, screenSize.height / 2 - 100, 300, 400);
        agentpanel.setOpaque(false);

        JLabel textLabelagent = new JLabel("Agent Login");
        textLabelagent.setFont(new Font("Abril Fatface", Font.BOLD, 50));
        textLabelagent.setBounds(23, 23, 20, 20); // change bounds to center and expand height]
        textLabelagent.setForeground(new Color(0, 204, 0)); // change color to green
        agentpanel.add(textLabelagent);

        ImageIcon imageIconag = new ImageIcon("D:\\real-estate-office\\real-estate-office\\src\\admin.png");
        Image imageag = imageIconag.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH); // resize image
        ImageIcon scaledIconag = new ImageIcon(imageag); // create new ImageIcon with the resized image
        JLabel imageLabelagent = new JLabel(scaledIconag);
        imageLabelagent.setBounds(45, 45, 45, 45);
        agentpanel.add(imageLabelagent);

        JButton agentloginButton = new JButton("Login");
        agentloginButton.setFont(new Font("Arial", Font.BOLD, 24));
        agentloginButton.setBounds(15, 15, 15, 15);
        agentpanel.add(agentloginButton);
        agentloginButton.addActionListener(this); // add ActionListener to handle button clicks

        agentloginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Agentloginform.main(new String[] {});
                // this.dispose();
            }
        });

        // -------------------------------------------------------------------------------------------------------------------------------

        JPanel buyerpanel = new JPanel();
        // buyerpanel.setBackground(new Color(255, 191, 128));
        buyerpanel.setBounds(screenSize.width / 1 - 900, screenSize.height / 2 - 100, 300, 400);
        buyerpanel.setOpaque(false);

        JLabel textLabelbuyer = new JLabel("Buyer Login");
        textLabelbuyer.setFont(new Font("Abril Fatface", Font.BOLD, 50));
        textLabelbuyer.setBounds(23, 23, 20, 20); // change bounds to center and expand height
        textLabelbuyer.setForeground(new Color(0, 204, 0)); // change color to green
        buyerpanel.add(textLabelbuyer);

        ImageIcon imageIconb = new ImageIcon("D:\\real-estate-office\\real-estate-office\\src\\admin.png");
        Image imageb = imageIconb.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH); // resize image
        ImageIcon scaledIconb = new ImageIcon(imageb); // create new ImageIcon with the resized image
        JLabel imageLabelbuyer = new JLabel(scaledIconb);
        imageLabelbuyer.setBounds(45, 45, 45, 45);
        buyerpanel.add(imageLabelbuyer);

        JButton buyerloginButton = new JButton("Login");
        buyerloginButton.setFont(new Font("Arial", Font.BOLD, 24));
        buyerloginButton.setBounds(15, 15, 15, 15);
        buyerpanel.add(buyerloginButton);
        buyerloginButton.addActionListener(this); // add ActionListener to handle button clicks

        buyerloginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Buyerloginform.main(new String[] {});
                // this.dispose();
            }
        });

        // ----------------------------------------------------------------------------------------------------------

        JPanel officepanel = new JPanel();
        // officepanel.setBackground(new Color(255, 191, 128));
        officepanel.setBounds(screenSize.width / 1 - 400, screenSize.height / 2 - 100, 300, 400);
        officepanel.setOpaque(false);

        JLabel textLabeloffice = new JLabel("Office Login");
        textLabeloffice.setFont(new Font("Abril Fatface", Font.BOLD, 50));
        textLabeloffice.setBounds(23, 23, 20, 20); // change bounds to center and expand height
        textLabeloffice.setForeground(new Color(0, 204, 0)); // change color to green
        officepanel.add(textLabeloffice);

        ImageIcon imageIcono = new ImageIcon("D:\\real-estate-office\\real-estate-office\\src\\admin.png");
        Image imageo = imageIcono.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH); // resize image
        ImageIcon scaledIcono = new ImageIcon(imageo); // create new ImageIcon with the resized image
        JLabel imageLabeloffice = new JLabel(scaledIcono);
        imageLabeloffice.setBounds(45, 45, 45, 45);
        officepanel.add(imageLabeloffice);

        JButton officeloginButton = new JButton("Login");
        officeloginButton.setFont(new Font("Arial", Font.BOLD, 24));
        officeloginButton.setBounds(15, 15, 15, 15);
        officepanel.add(officeloginButton);
        officeloginButton.addActionListener(this); // add ActionListener to handle button clicks

        officeloginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Officeloginform.main(new String[] {});
                // this.dispose();
            }
        });

        // --------------------------------------------------------------------------------------------------------------------------------------------
        JButton contact = new JButton("Contact us");
        contact.setFont(new Font("Arial", Font.BOLD, 24));
        contact.setBounds(1710, 960, 160, 50);

        contact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contactus.main(new String[] {});
                // this.dispose();
            }
        });

        // -----------------------------------------------------------------------------------------------------------------------

        this.add(contact);
        this.add(buyerpanel);
        this.add(agentpanel);
        this.add(adminpanel);
        this.add(officepanel);

        this.add(searchButton); // add button to the panel

        // this.add(button);
        this.add(textLabel);
        this.setLayout(null);
        this.add(imageLabel);
        this.setResizable(false);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchButton) {
            // System.out.println("hi");
            new Filter();
        }

    }

    public static void main(String[] args) {
        new mypro();
    }
}
