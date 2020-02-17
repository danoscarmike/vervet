package com.danoscarmike.vervet;

public enum LanguageName {
    CPP("C++"),
    DOTNET("C#"),
    ELIXIR("Elixir"),
    GO("Go"),
    JAVA("Java"),
    NODEJS("Node.js"),
    PHP("PHP"),
    PYTHON("Python"),
    RUBY("Ruby");

    private String prettyName;

    LanguageName(String s) {
        this.prettyName = s;
    }

    public String getPrettyName() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
