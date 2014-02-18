/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p1200886
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

import java.util.*;

/** @pdOid 6a512c7b-24e4-4174-8b20-3c2b5ec40438 */
public class Arbitre {
   /** @pdOid 6c0f1d46-a73d-4696-b349-0814bb115ee1 */
   private int numArbitre;
   /** @pdOid 643c0d43-dc0f-4d7d-b31a-4e3d98efde52 */
   private String nom;
   /** @pdOid ccf9135a-bed8-4f2d-9d68-c862acc4c4c6 */
   private String prenom;
   /** @pdOid 8af4e080-1cd0-4df3-83fd-654acb723969 */
   private java.util.Date date_de_naissance;
   /** @pdOid 06638ba6-be45-4dc3-9f49-0ca2b41da3cb */
   private String categorie;
   /** @pdOid 2e410189-e25b-4211-a44e-d202e759b943 */
   private int nombreArbitrage;
   
   /** @pdRoleInfo migr=no name=Match assc=juge__ coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Match> match;
   
   /** @pdOid f47c64b7-c5b6-4744-8a7b-c4f5d53c254e */
   public boolean PeutArbitrer() {
      // TODO: implement
      return false;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getMatch() {
      if (match == null)
         match = new java.util.HashSet<Match>();
      return match;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMatch() {
      if (match == null)
         match = new java.util.HashSet<Match>();
      return match.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMatch */
   public void setMatch(java.util.Collection<Match> newMatch) {
      removeAllMatch();
      for (java.util.Iterator iter = newMatch.iterator(); iter.hasNext();)
         addMatch((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addMatch(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.match == null)
         this.match = new java.util.HashSet<Match>();
      if (!this.match.contains(newMatch))
      {
         this.match.add(newMatch);
         newMatch.addArbitre(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeMatch(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.match != null)
         if (this.match.contains(oldMatch))
         {
            this.match.remove(oldMatch);
            oldMatch.removeArbitre(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMatch() {
      if (match != null)
      {
         Match oldMatch;
         for (java.util.Iterator iter = getIteratorMatch(); iter.hasNext();)
         {
            oldMatch = (Match)iter.next();
            iter.remove();
            oldMatch.removeArbitre(this);
         }
      }
   }

}