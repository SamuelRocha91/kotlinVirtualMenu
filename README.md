# Restaurant Menu Application

<h2>🌐</h2>
<ul>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu" target="_blank">Português</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md" target="_blank">Español</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md" target="_blank">English</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md" target="_blank">Русский</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md" target="_blank">中文</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md" target="_blank">العربية</a></li>
</ul>

Este repositório contém o código-fonte para uma aplicação Android que exibe um cardápio de restaurante. A aplicação inclui funcionalidades para visualizar uma lista de pratos, detalhes de cada prato e navegação entre as telas.

![Preview da aplicação](./assets/menuVirtual.gif)

## Funcionalidades

1. **Tela Inicial do Cardápio**: 
   - Exibe a logo do restaurante.
   - Título da tela inicial.
   - Lista de itens do cardápio.

2. **Tela de Detalhes do Prato**:
   - Exibe a logo do restaurante.
   - Título da tela de detalhe.
   - Botão de voltar.
   - Imagem do prato.
   - Título do prato.
   - Descrição do prato.
   - Valor do prato.

3. **Lista de Pratos Disponíveis**:
   - Inclui pratos como File de Carne com Fritas, Frango Grelhado com Legumes, Mix de File de Carne e Frango Grelhados, entre outros.
   - Cada prato possui uma imagem, descrição e preço.

4. **Layout de Item do Cardápio**:
   - Utiliza `MaterialCardView` para exibir cada item do cardápio com uma imagem e título.

5. **Eventos de Clique**:
   - Navegação para a tela de detalhes ao clicar em um item do menu.
   - Retorno à tela principal ao clicar no botão voltar na tela de detalhes.

## Tecnologias Utilizadas

- **Android SDK**: Para o desenvolvimento da aplicação Android.
- **RecyclerView**: Para exibir a lista de itens do cardápio.
- **Data Classes**: Para representar os dados dos pratos.
- **Adapters**: Para ligar os dados à interface de usuário.
- **Layouts**: Inclui `LinearLayout`, `ScrollView`, e `MaterialCardView` para estruturar as telas.

## Configuração do Projeto

Para rodar o projeto localmente, siga as etapas abaixo:

### Pré-requisitos

- [Android Studio](https://developer.android.com/studio) instalado em sua máquina.
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) ou superior.

### Clonando o Repositório

1. Clone o repositório para sua máquina local:
   ```bash
   git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd kotlinVirtualMenu
   ```

### Configuração do Projeto

1. Abra o projeto no Android Studio.
2. Certifique-se de que o Android Studio está configurado para usar o JDK 11 ou superior.
3. Sincronize o projeto com o Gradle:
   - No Android Studio, clique em "File" > "Sync Project with Gradle Files".

### Executando o Projeto

1. Conecte um dispositivo Android ao seu computador ou inicie um emulador Android.
2. Execute a aplicação:
   - No Android Studio, clique no botão "Run" (ícone de play) na parte superior da janela.

## Estrutura de Diretórios

- `app/src/main/java/com/exemplo/trybevirtualmenu/`: Código-fonte da aplicação.
- `app/src/main/res/layout/`: Arquivos de layout XML.
- `app/src/main/res/drawable/`: Imagens e outros recursos gráficos.
