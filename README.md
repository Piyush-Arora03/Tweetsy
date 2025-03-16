<h1><b>Tweetsy</b> 🐦📱</h1>
<h3><i>A simple Android app to filter and display tweets based on different categories like Android Development, Facts, Coding, and System Design using Jetpack Compose.</i></h3>
<br>

<p align="center">
  <img src="Screenshot 2025-03-15 213402.png" alt="Tweetsy Banner">
  <!-- Replace with actual banner image -->
</p>
<br>

<h3><b>🚀 Features</b></h3>
✔ MVVM Architecture – Clean, scalable & maintainable code<br>
✔ Jetpack Compose UI – Modern UI with declarative components<br>
✔ Room Database – Offline storage for tweets<br>
✔ Retrofit API Integration – Fetch tweets dynamically<br>
✔ Category-Based Filtering – View tweets related to Android Dev, Coding, System Design, and Facts<br>
✔ Hilt for Dependency Injection – Efficient and scalable DI<br>
<br>

<h3><b>📸 Screenshots</b></h3>
<p align="center">
  <img src="Screenshot_20250315_211913.png" width="200"> 
  <img src="Screenshot_20250315_211931.png" width="200"> 
</p>
<br>

<h3><b>🛠 Tech Stack</b></h3>
- **Kotlin** – Primary language<br>
- **Jetpack Compose** – UI framework<br>
- **MVVM Architecture** – For better code structure<br>
- **Room Database** – Local storage<br>
- **Retrofit** – API calls<br>
- **Hilt** – Dependency Injection<br>
- **Coroutines & Flow** – Asynchronous programming<br>
- **Git & GitHub** – Version control<br>
<br>

<h3><b>📦 Installation</b></h3>
1️⃣ **Clone the repository**<br>
<pre><code>git clone https://github.com/your-username/tweetsy.git</code></pre>
2️⃣ **Open in Android Studio**<br>
3️⃣ **Build & Run on an Android Emulator or Device**<br>
<br>

<h3><b>🔧 Setup API (If Required)</b></h3>
Tweetsy fetches tweets dynamically from an API. You can use <a href="https://jsonbin.io/">jsonbin.io</a> to create and manage your own JSON data and <a href="https://www.postman.com/">Postman</a> to configure and test API endpoints.<br>
<br>

<b>📌 Steps to Create Your API on jsonbin.io</b><br>
1️⃣ **Go to** <a href="https://jsonbin.io/">jsonbin.io</a> and sign in.<br>
2️⃣ **Click on "Create a New Bin"** and paste the following sample JSON:<br>

<pre><code>[
    {
        "id": 1,
        "category": "Android Development",
        "tweet": "Jetpack Compose makes UI development easier and more intuitive! 🚀"
    },
    {
        "id": 2,
        "category": "Facts",
        "tweet": "Did you know? The first computer virus was created in 1986! 💻"
    },
    {
        "id": 3,
        "category": "Coding",
        "tweet": "Clean code is not just for computers, but for humans too! ✨"
    },
    {
        "id": 4,
        "category": "System Design",
        "tweet": "Load balancing helps distribute traffic across multiple servers efficiently. ⚡"
    }
]</code></pre>
📌 Modify or expand this JSON to fit your needs.<br>
<br>

3️⃣ **Save the bin and copy the generated API endpoint URL.**<br>
4️⃣ **Modify the `Constants.kt` file in Tweetsy and update the BASE_URL:**<br>

<pre><code>object Constants {
    const val BASE_URL = "https://api.jsonbin.io/v3/b/YOUR_BIN_ID?meta=false"
}</code></pre>
📌 Replace <b>YOUR_BIN_ID</b> with the actual Bin ID from jsonbin.io.<br>
<br>

<h3><b>🛠 Configuring & Testing API Endpoints with Postman</b></h3>
1️⃣ **Download & Install** <a href="https://www.postman.com/">Postman</a>.<br>
2️⃣ **Open Postman** and click on **"New Request"**.<br>
3️⃣ **Select `GET` method** and paste your `jsonbin.io` API URL.<br>
4️⃣ **Click "Send"** to check if the API is returning the correct JSON response.<br>
5️⃣ **Modify API Headers (if needed):**<br>
    - If your API requires headers, add them in the **Headers** section.<br>
    - Example:<br>
<pre><code>Key: X-JSON-Path  
Value: tweets..category</code></pre>
6️⃣ **Use the API URL in Tweetsy** to fetch tweets dynamically.<br>
<br>

<h3><b>📄 Ensure Internet Permission</b></h3>
📌 Add this to your `AndroidManifest.xml` file to allow network requests:<br>

<pre><code>&lt;uses-permission android:name="android.permission.INTERNET"/&gt;</code></pre>

Now, **Tweetsy** will fetch tweets from your **custom API endpoint**, and you can test & modify it using **Postman**! 🚀<br>
<br>
<br>

<h2 align="center">⭐ Like this project? Give it a star! 🌟</h2>
<h3 align="center">If you found this project helpful, consider giving it a ⭐ on GitHub and sharing your thoughts! 🚀</h3>
# Tweetsy
# Tweetsy
