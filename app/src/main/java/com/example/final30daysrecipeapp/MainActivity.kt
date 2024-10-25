package com.example.final30daysrecipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recipeRecyclerView: RecyclerView
    private lateinit var recipeAdapter: RecipeAdapter
    private lateinit var recipeList: MutableList<Recipe>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize recipe list
        recipeList = ArrayList()

        recipeList.add(
            Recipe(
                "Day 1",
                "Easy One-Pan Dinners",
                "Start simple with a one-pan meal like roasted chicken with vegetables. Toss chicken thighs, potatoes, and carrots in olive oil, garlic, and rosemary, then bake for 40 minutes.",
                R.drawable.day1
            )
        )
        recipeList.add(
            Recipe(
                "Day 2",
                "Quick Pasta Fix",
                "Try a 15-minute garlic butter pasta with spinach. Sauté garlic in butter, toss in cooked pasta, spinach, and parmesan for a deliciously simple meal.",
                R.drawable.day2
            )
        )
        recipeList.add(
            Recipe(
                "Day 3",
                "Fresh Salads",
                "Make a refreshing Greek salad. Combine tomatoes, cucumbers, olives, feta, and a drizzle of olive oil with lemon juice and oregano.",
                R.drawable.day3
            )
        )
        recipeList.add(
            Recipe(
                "Day 4",
                "Comfort Soups",
                "Create a hearty minestrone soup with beans, pasta, and vegetables simmered in a tomato-based broth.",
                R.drawable.day4
            )
        )
        recipeList.add(
            Recipe(
                "Day 5",
                "Meatless Mondays",
                "Prepare a satisfying vegetable stir-fry with tofu. Stir-fry bell peppers, broccoli, and tofu in a soy-ginger sauce.",
                R.drawable.day5
            )
        )
        recipeList.add(
            Recipe(
                "Day 6",
                "Breakfast Anytime",
                "Whip up an easy shakshuka with poached eggs in a spicy tomato sauce, perfect for breakfast or dinner.",
                R.drawable.day6
            )
        )
        recipeList.add(
            Recipe(
                "Day 7",
                "Mexican Night",
                "Make chicken fajitas by sautéing onions, bell peppers, and chicken strips in fajita seasoning. Serve with warm tortillas.",
                R.drawable.day7
            )
        )
        recipeList.add(
            Recipe(
                "Day 8",
                "Mediterranean Delights",
                "Enjoy a Mediterranean grain bowl with quinoa, roasted vegetables, hummus, and a drizzle of tahini dressing.",
                R.drawable.day8
            )
        )
        recipeList.add(
            Recipe(
                "Day 9",
                "Sheet Pan Magic",
                "Roast salmon and asparagus with lemon and garlic for an easy, healthy sheet pan dinner.",
                R.drawable.day9
            )
        )
        recipeList.add(
            Recipe(
                "Day 10",
                "Cozy Casseroles",
                "Bake a creamy tuna noodle casserole with pasta, peas, and a crunchy breadcrumb topping.",
                R.drawable.day10
            )
        )
        recipeList.add(
            Recipe(
                "Day 11",
                "Asian-Inspired",
                "Cook a simple sesame ginger stir-fry with shrimp, broccoli, and snow peas.",
                R.drawable.day11
            )
        )
        recipeList.add(
            Recipe(
                "Day 12",
                "Taco Tuesday",
                "Assemble fish tacos with grilled fish, a cabbage slaw, and a squeeze of lime.",
                R.drawable.day12
            )
        )
        recipeList.add(
            Recipe(
                "Day 13",
                "Slow Cooker Comfort",
                "Set your slow cooker to make beef stew. Combine chunks of beef, potatoes, carrots, and broth, and let it cook slowly for tender results.",
                R.drawable.day13
            )
        )
        recipeList.add(
            Recipe(
                "Day 14",
                "Light & Fresh",
                "Enjoy a refreshing cucumber and avocado salad with lime dressing.",
                R.drawable.day14
            )
        )
        recipeList.add(
            Recipe(
                "Day 15",
                "Italian Classics",
                "Cook a classic spaghetti carbonara with pancetta, eggs, and parmesan.",
                R.drawable.day15
            )
        )
        recipeList.add(
            Recipe(
                "Day 16",
                "Weeknight Pizza",
                "Create a quick homemade pizza using pre-made dough, tomato sauce, mozzarella, and your favorite toppings.",
                R.drawable.day16
            )
        )
        recipeList.add(
            Recipe(
                "Day 17",
                "5-Ingredient Recipes",
                "Try an easy chicken piccata with lemon, capers, butter, and a side of pasta.",
                R.drawable.day17
            )
        )
        recipeList.add(
            Recipe(
                "Day 18",
                "Asian Noodles",
                "Make peanut noodles by tossing soba noodles in a creamy peanut butter and soy sauce dressing, topped with shredded carrots.",
                R.drawable.day18
            )
        )
        recipeList.add(
            Recipe(
                "Day 19",
                "Soup & Sandwiches",
                "Pair a grilled cheese sandwich with tomato soup for the ultimate comfort food combo.",
                R.drawable.day19
            )
        )
        recipeList.add(
            Recipe(
                "Day 20",
                "Healthy Bowls",
                "Build a healthy grain bowl with brown rice, black beans, avocado, corn, and salsa.",
                R.drawable.day20
            )
        )
        recipeList.add(
            Recipe(
                "Day 21",
                "Kid-Friendly Meals",
                "Prepare a fun homemade mac and cheese with a creamy cheese sauce and crispy breadcrumb topping.",
                R.drawable.day21
            )
        )
        recipeList.add(
            Recipe(
                "Day 22",
                "French-Inspired",
                "Cook a classic coq au vin, braising chicken in red wine with mushrooms and onions.",
                R.drawable.day22
            )
        )
        recipeList.add(
            Recipe(
                "Day 23",
                "Mediterranean Appetizers",
                "Serve a mezze platter with hummus, baba ghanoush, olives, and pita.",
                R.drawable.day23
            )
        )
        recipeList.add(
            Recipe(
                "Day 24",
                "Instant Pot Magic",
                "Make an Instant Pot chicken curry with coconut milk, curry powder, and tender chicken.",
                R.drawable.day24
            )
        )
        recipeList.add(
            Recipe(
                "Day 25",
                "Vegan Delights",
                "Cook a hearty lentil stew with tomatoes, spinach, and plenty of spices.",
                R.drawable.day25
            )
        )
        recipeList.add(
            Recipe(
                "Day 26",
                "Brunch Favorites",
                "Bake fluffy blueberry pancakes, perfect for a weekend brunch.",
                R.drawable.day26
            )
        )
        recipeList.add(
            Recipe(
                "Day 27",
                "Italian Comfort",
                "Create a rich lasagna with layers of ricotta, mozzarella, marinara, and ground beef.",
                R.drawable.day27
            )
        )
        recipeList.add(
            Recipe(
                "Day 28",
                "Mediterranean Wraps",
                "Make a falafel wrap with crispy falafel, lettuce, tomatoes, and tzatziki in pita bread.",
                R.drawable.day28
            )
        )
        recipeList.add(
            Recipe(
                "Day 29",
                "Sweet Treats",
                "Bake a simple batch of chocolate chip cookies for dessert.",
                R.drawable.day29
            )
        )
        recipeList.add(
            Recipe(
                "Day 30",
                "Global Fusion",
                "Try Korean BBQ tacos with grilled marinated beef, kimchi, and spicy mayo.",
                R.drawable.day30
            )
        )


        recipeRecyclerView = findViewById(R.id.recipeRecyclerView)
        recipeAdapter = RecipeAdapter(this, recipeList)

        // Set up RecyclerView
        recipeRecyclerView.adapter = recipeAdapter
        recipeRecyclerView.layoutManager = LinearLayoutManager(this) // Vertical orientation
    }
}
