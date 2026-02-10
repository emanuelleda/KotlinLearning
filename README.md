# 🏠 SmartHome System (Java)

Este projeto é uma simulação de um ecossistema de casa inteligente, desenvolvido para praticar conceitos avançados de **Programação Orientada a Objetos (POO)** em Java. O sistema permite controlar dispositivos como Smart TVs e Lâmpadas através de uma interface gráfica e um serviço centralizado.

## 🛠️ Tecnologias e Ferramentas
* **Linguagem:** Java (OpenJDK 25)
* **Interface Gráfica:** Java Swing
* **Arquitetura:** Baseada no padrão MVC (Model-View-Controller)
* **Versionamento:** Git & GitHub
* **Ambiente:** Ubuntu Linux

## 🏗️ Estrutura do Projeto
O código está organizado em pacotes para garantir a separação de responsabilidades:

* **`com.smarthome.model`**: Contém a classe abstrata `SmartDevice` e as interfaces `ComVolume` e `ComBrilho`.
* **`com.smarthome.devices`**: Implementações reais dos dispositivos (`SmartTvDevice` e `LampadaInteligente`).
* **`com.smarthome.service`**: Classe `CasaInteligente` que gerencia a lógica de negócio e contagem de dispositivos.
* **`com.smarthome.view`**: Interface gráfica (`JanelaCasa`) com log de atividades em tempo real.

## 🚀 Funcionalidades
* **Controle de TV**: Ligar/Desligar, ajuste de volume e troca de canais.
* **Controle de Iluminação**: Ligar/Desligar e ajuste de intensidade de brilho.
* **Log de Atividades**: Visualização em tempo real das ações executadas através de uma interface estilo terminal.
* **Gestão de Energia**: Contador central de quantos dispositivos estão ativos no momento.

## 📸 Interface
A interface utiliza o visual nativo do sistema operacional (GTK no Ubuntu) e conta com um painel lateral de comandos e uma área de histórico com visual "dark mode".

---
Desenvolvido por **Emanuel** (emanuelleda) como parte de estudos em arquitetura de software e Java.
