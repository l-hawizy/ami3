package org.contentmine.norma.sections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import nu.xom.Element;

public class JATSSuffixElement extends JATSElement {
    private static final Logger LOG = Logger.getLogger(JATSSuffixElement.class);
    static {
        LOG.setLevel(Level.DEBUG);
    }

    public static String TAG = "suffix";

    public JATSSuffixElement(Element element) {
        super(element);
    }
}
