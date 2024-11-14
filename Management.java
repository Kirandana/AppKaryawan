import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Management implements ActionListener {

    JFrame frame = new JFrame();
    JLabel nama, jabatan, gaji;
    JTextField namaTF, jabatanTF, gajiTF;
    JPanel box;
    JButton tambah = new JButton();
    JButton save = new JButton();

    Font myFont = new Font("Arial", Font.PLAIN, 15);
    Font buttonFont = new Font("Arial", Font.BOLD, 15);

    Management() {

        frame = new JFrame("Aplikasi Karyawan");
        frame.setSize(430, 380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        JLabel nama = new JLabel("Nama: ");
        nama.setBounds(60, 50, 90, 20);
        nama.setFont(myFont);

        namaTF = new JTextField();
        namaTF.setBounds(130, 50, 125, 20);
        namaTF.setBorder(BorderFactory.createEmptyBorder());
        namaTF.setFont(myFont);

        JLabel jabatan = new JLabel("Jabatan: ");
        jabatan.setBounds(60, 75, 125, 20);
        jabatan.setFont(myFont);

        jabatanTF = new JTextField();
        jabatanTF.setBounds(130, 75, 125, 20);
        jabatanTF.setBorder(BorderFactory.createEmptyBorder());
        jabatanTF.setFont(myFont);

        JLabel gaji = new JLabel("Gaji: ");
        gaji.setBounds(60, 100, 125, 20);
        gaji.setFont(myFont);

        gajiTF = new JTextField();
        gajiTF.setBounds(130, 100, 125, 20);
        gajiTF.setBorder(BorderFactory.createEmptyBorder());
        gajiTF.setFont(myFont);

        tambah = new JButton("Tambah");
        tambah.setBounds(130, 130, 125, 20);
        tambah.setFont(buttonFont);
        tambah.setBorder(BorderFactory.createEmptyBorder());
        tambah.setFocusable(false);
        tambah.addActionListener(this);

        box = new JPanel();
        box.setBounds(60, 160, 300, 100);
        box.setBackground(Color.WHITE);
        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));

        save = new JButton("Save");
        save.setBounds(140, 270, 125, 30);
        save.setFont(buttonFont);
        save.setBorder(BorderFactory.createEmptyBorder());
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.setFocusable(false);

        frame.add(save);
        frame.add(box);
        frame.add(tambah);
        frame.add(gajiTF);
        frame.add(gaji);
        frame.add(jabatanTF);
        frame.add(jabatan);
        frame.add(nama);
        frame.add(namaTF);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Management run = new Management();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambah) {
            String employeeInfo = namaTF.getText() + " - " + jabatanTF.getText() + " - Rp." + gajiTF.getText();
            JLabel employeeLabel = new JLabel(employeeInfo);
            employeeLabel.setFont(myFont);

            box.add(employeeLabel);
            box.revalidate();
            box.repaint();

            namaTF.setText("");
            jabatanTF.setText("");
            gajiTF.setText("");

            System.out.println(employeeInfo);
        }
    }
}