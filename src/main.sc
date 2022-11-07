require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Vamos começar.

    state: Hello
        intent!: /hello
        a: Olá

    state: Bye
        intent!: /bye
        a: Tchau

    state: NoMatch
        event!: noMatch
        a: Eu não entendo. Você disse: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}