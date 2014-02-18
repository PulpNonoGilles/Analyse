/***********************************************************************
 * Module:  Ramasseur_de_balles.java
 * Author:  p1200886
 * Purpose: Defines the Class Ramasseur_de_balles
 ***********************************************************************/

import java.util.*;

/** @pdOid 29e73af2-60f9-4982-baf0-858506a4c595 */
public class Ramasseur_de_balles {
   /** @pdOid 4cf4d277-2414-469b-b1ce-f001adfd674f */
   private int numRamasseur;
   /** @pdOid 83b7051d-df77-4523-a1f7-ee55e0a66970 */
   private String nom;
   /** @pdOid 39679b88-3a3a-4fa3-9a31-a924edaf7adb */
   private String prenom;
   /** @pdOid ef53a98b-9063-4bcf-8a1c-a5f7de20b825 */
   private java.util.Date date_de_naissance;
   
   /** @pdRoleInfo migr=no name=Match assc=participe__ coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Match> match;
   
   
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
         newMatch.addRamasseur_de_balles(this);      
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
            oldMatch.removeRamasseur_de_balles(this);
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
            oldMatch.removeRamasseur_de_balles(this);
         }
      }
   }

}