# Smurf Project

**Table of Content:**

1.  [What Is This App](#what-is-this-app)
2.  [What Does It Do](#what-does-it-do)

---

## What Is This App

This Java App is a Smurf videogame. It reads a .txt file for player and map informations and creates the map acordingly. The player tries to escape the dungeon while Gargamel and his cat Azrael tries to catch them.

## What Does It Do

- It reads a .txt file and creates the map, the playable character and enemies acordingly. You can edit this txt file to add more difficult dungeons.

- Both the player and enemy AI stars from their respective position and the player tries to escape from the dungeon while the enemies try to catch them.

- Enemies use Djikstra's Shortest Path Algorithm to find the shortest path to the player.

- The player must find their way out before being caught by the AI. If the player gets caught two times, it's game over.
