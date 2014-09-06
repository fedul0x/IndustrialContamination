package ru.fedul0x.ic;

import javax.swing.UIManager;
import org.hibernate.Session;
import ru.fedul0x.ic.dataaccess.HibernateUtil;
import ru.fedul0x.ic.dataaccess.dataobject.ContaminationByFederalClassification;
import ru.fedul0x.ic.gui.DatabaseSettingsFrame;
import ru.fedul0x.ic.gui.MainFrame;

/**
 *
 * @author Ivashin Alexey
 */
public class IndustrialContamination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndustrialContamination.class.getName()).
                    log(java.util.logging.Level.WARNING, "Can't install look and feel class", ex);

        }
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
//        System.out.println("Hello World!");
//        Session session = HibernateUtil.getSessionFactory()
//                .getCurrentSession();
//        session.beginTransaction();
//        ContaminationByFederalClassification user = (ContaminationByFederalClassification) session.get(ContaminationByFederalClassification.class, 10L);
//        session.getTransaction().commit();
//        System.err.println(user);
    }

}
