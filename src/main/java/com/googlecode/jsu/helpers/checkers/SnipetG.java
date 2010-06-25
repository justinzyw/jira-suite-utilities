package com.googlecode.jsu.helpers.checkers;

/**
 * @author <A href="mailto:abashev at gmail dot com">Alexey Abashev</A>
 * @version $Id$
 */
class SnipetG implements ComparingSnipet {
	/* (non-Javadoc)
	 * @see com.googlecode.jsu.helpers.checkers.ComparingSnipet#compareObjects(java.lang.Comparable, java.lang.Comparable)
	 */
	@SuppressWarnings("unchecked")
	public boolean compareObjects(Comparable comp1, Comparable comp2) {
		if (comp1 == null) {
			return false;
		}
		
		if (comp2 == null) {
			return false;
		}
		
		return (comp1.compareTo(comp2) > 0);
	}
}