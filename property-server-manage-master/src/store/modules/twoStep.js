const twoStep = {

    state: {
        unitMessage: []
    },
    mutations: {
        SET_TITLE2(state, payload) {
            state.unitMessage = payload.unitMessage
            console.log('twoStep', state.unitMessage)
        }
    },
    actions: {

    },
    getters: {

    }

}

export default twoStep
