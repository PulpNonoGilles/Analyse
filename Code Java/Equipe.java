/***********************************************************************
 * Module:  Equipe.java
 * Author:  p1200886
 * Purpose: Defines the Class Equipe
 ***********************************************************************/

import java.util.*;

/** @pdOid 9be9f38c-cf72-478a-8835-f82017b65ee1 */
public class Equipe {
   /** @pdOid a23f49f2-7c9d-43ca-87f1-e867cce17750 */
   private int numEquipe;
   
   /** @pdRoleInfo migr=no name=Joueur assc=__comporte coll=java.util.Collection impl=java.util.HashSet mult=1..2 type=Aggregation */
   public java.util.Collection<Joueur> joueur;
   /** @pdRoleInfo migr=no name=Match assc=joue__ coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Match> match;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Joueur> getJoueur() {
      if (joueur == null)
         joueur = new java.util.HashSet<Joueur>();
      return joueur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJoueur() {
      if (joueur == null)
         joueur = new java.util.HashSet<Joueur>();
      return joueur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJoueur */
   public void setJoueur(java.util.Collection<Joueur> newJoueur) {
      removeAllJoueur();
      for (java.util.Iterator iter = newJoueur.iterator(); iter.hasNext();)
         addJoueur((Joueur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJoueur */
   public void addJoueur(Joueur newJoueur) {
      if (newJoueur == null)
         return;
      if (this.joueur == null)
         this.joueur = new java.util.HashSet<Joueur>();
      if (!this.joueur.contains(newJoueur))
      {
         this.joueur.add(newJoueur);
         newJoueur.setEquipe(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldJoueur */
   public void removeJoueur(Joueur oldJoueur) {
      if (oldJoueur == null)
         return;
      if (this.joueur != null)
         if (this.joueur.contains(oldJoueur))
         {
            this.joueur.remove(oldJoueur);
            oldJoueur.setEquipe((Equipe)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJoueur() {
      if (joueur != null)
      {
         Joueur oldJoueur;
         for (java.util.Iterator iter = getIteratorJoueur(); iter.hasNext();)
         {
            oldJoueur = (Joueur)iter.next();
            iter.remove();
            oldJoueur.setEquipe((Equipe)null);
         }
      }
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
         newMatch.addEquipe(this);      
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
            oldMatch.removeEquipe(this);
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
            oldMatch.removeEquipe(this);
         }
      }
   }

}