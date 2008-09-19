//----------------------------------------------------------------------------//
//                                                                            //
//                         G l y p h L a g E v e n t                          //
//                                                                            //
//  Copyright (C) Herve Bitteur 2000-2007. All rights reserved.               //
//  This software is released under the GNU General Public License.           //
//  Contact author at herve.bitteur@laposte.net to report bugs & suggestions. //
//----------------------------------------------------------------------------//
//
package omr.selection;


/**
 * Class <code>GlyphLagEvent</code> is an abstract class to represent any event
 * specific to a glyph lag (glyph, glyph id, glyph set) on top of basic lag
 * events (run, section, section id)
 *
 * <dl>
 * <dt><b>Publishers:</b><dd>
 * <dt><b>Subscribers:</b><dd>
 * <dt><b>Readers:</b><dd>
 * </dl>
 *
 * @author Herv&eacute Bitteur
 * @version $Id$
 */
public abstract class GlyphLagEvent
    extends UserEvent
{
    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new GlyphLagEvent object.
     * @param source the actual entity that created this event
     * @param hint how the event originated
     * @param movement the precise mouse movement
     */
    public GlyphLagEvent (Object        source,
                          SelectionHint hint,
                          MouseMovement movement)
    {
        super(source, hint, movement);
    }
}