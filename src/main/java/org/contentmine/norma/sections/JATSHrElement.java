package org.contentmine.norma.sections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import nu.xom.Element;

public class JATSHrElement extends JATSElement {
    private static final Logger LOG = Logger.getLogger(JATSHrElement.class);
    static {
        LOG.setLevel(Level.DEBUG);
    }

    public static String TAG = "hr";

    public JATSHrElement(Element element) {
        super(element);
    }
}
