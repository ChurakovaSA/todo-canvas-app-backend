theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача|~запись]
            $AnyText::anyText
            
        random:
            a: Добавлено!
            a: Записано!
            a: Зафиксировано!!
            
        script:
            addNote($parseTree._anyText, $context);
            addSuggestions(["Добавь задачу купить машину"], $context);
