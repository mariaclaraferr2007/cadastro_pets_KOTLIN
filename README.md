# 🐾 Cadastro de Pets
Aplicativo Android desenvolvido em Kotlin que permite o cadastro e gerenciamento de informações de animais de estimação. O projeto simula uma pequena base de dados de pets, ideal para praticar conceitos de Room Database, DAO, arquitetura MVVM e interface com XML.

💡 Ideal para quem deseja aprender como salvar dados localmente no Android e aplicar boas práticas com SQLite via Room.

---

## 📱 Tecnologias Utilizadas

Kotlin

Android Studio

XML para construção da interface

Room (SQLite)

Componentes nativos do Android

---

## ✨ Funcionalidades
Cadastro de novos pets com dados básicos

Armazenamento local utilizando Room Database

Interface intuitiva para entrada e visualização de dados

Estrutura modular com Model, DAO e Repository

Separação de responsabilidades com boas práticas de arquitetura Android

---

## 🚀 Como Executar o Projeto

Clone este repositório:

git clone https://github.com/seu-usuario/CadastroPets.git

- Abra o projeto no Android Studio

- Aguarde a sincronização do Gradle

- Execute o app em um dispositivo físico ou emulador Android

- Cadastre e visualize pets diretamente no aplicativo!

---

## 🛠 Estrutura do Projeto

📁 app

 ┣ 📂 java
 
 ┃ ┗ 📂 com.example.cadastropets22300570
 
 ┃   ┣ 📜 MainActivity.kt → Tela principal com o formulário de cadastro
 
 ┃   ┣ 📂 model
 
 ┃   ┃ ┗ 📜 PetModel.kt → Classe de dados representando o pet
 
 ┃   ┣ 📂 dao
 
 ┃   ┃ ┗ 📜 PetDao.kt → Interface com as operações do banco de dados
 
 ┃   ┗ 📂 repository
 
 ┃     ┗ 📜 PetDatabase.kt → Configuração da base de dados Room
 
 ┣ 📂 res
 
 ┃ ┣ 📂 layout
 
 ┃ ┃ ┗ 📜 activity_main.xml → Interface da tela principal
 
 ┃ ┗ 📂 values, drawable, mipmap, xml → Cores, temas e recursos visuais

┗ 📜 AndroidManifest.xml

---
 
## 💡 Aprendizados

Este projeto permitiu praticar:

Criação de bancos de dados locais com Room

Utilização de DAO para persistência de dados

Organização de projeto Android com pacotes bem definidos

Entrada de dados com EditText e validação

Separação entre camada de dados e interface

Manipulação de listas com RecyclerView (caso implementado futuramente)

---

## 👩‍💻 Autor

Desenvolvido por Maria Clara Ferreira Lopes

🎓 Estudante de Técnico em Informática - COTEMIG

📧 Email: mariaclaraferreiralopes82@gmail.com

🔗 LinkedIn: https://www.linkedin.com/in/maria-clara-ferreira-lopes/
