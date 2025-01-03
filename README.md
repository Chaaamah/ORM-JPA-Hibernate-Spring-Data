# ORM-JPA-Hibernate-Spring-Data

<h1>Diagramme</h1>

<img src="Captures/diag.jpg">

<h2>1- Création de l'entité Product</h2>

<img src="Captures/img1.jpg">

<p>Les attributs suivants ont été ajoutés à l'entité Product :</p>

<ul>
    <li>id : de type Long et annoté avec @Id et @GeneratedValue pour en faire une clé primaire auto-générée.</li>
    <li>name : de type String, représentant le nom du produit.</li>
    <li>price : de type double, représentant le prix du produit.</li>
    <li>quantity : de type int, représentant la quantité du produit en stock.</li>
</ul>

<h2>Configuration de l'unité de persistance dans</h2>

<img src="Captures/img2.jpg">

<p>Cette configuration permet à l'application de se connecter à une base de données H2 en mémoire, d'activer la console H2 pour inspecter les données et de configurer Hibernate pour mettre à jour le schéma automatiquement.</p>

<h2>Création de l'interface ProductRepository</h2>

<img src="Captures/img3.jpg">

<p>L'interface étend JpaRepository, ce qui permet d'hériter des méthodes de base comme save(), findAll(), findById(), etc. La méthode personnalisée findByNameContaining permet de rechercher des produits par leur nom, avec un critère de correspondance partielle.</p>

<h1>Tests:</h1>

<h3>Ajouter des produits</h3>

<img src="Captures/test2.jpg">0

<h3>Consulter tous les produits</h3>

<img src="Captures/test1.jpg">

<h3>Consulter un produit</h3>

<img src="Captures/test3.jpg">

<h3>Chercher des produits</h3>

<img src="Captures/test4.jpg">

<h1>Migration de H2 Database vers MySQL</h1>

<img src="Captures/sql.jpg">






