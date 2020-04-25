.class final Lwtf/riceteacatpanda/quiz/Game$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwtf/riceteacatpanda/quiz/Game;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lwtf/riceteacatpanda/quiz/Game;


# direct methods
.method constructor <init>(Lwtf/riceteacatpanda/quiz/Game;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwtf/riceteacatpanda/quiz/Game$2;->b:Lwtf/riceteacatpanda/quiz/Game;

    iput-object p2, p0, Lwtf/riceteacatpanda/quiz/Game$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$2;->b:Lwtf/riceteacatpanda/quiz/Game;

    const v1, 0x7f070066

    invoke-virtual {v0, v1}, Lwtf/riceteacatpanda/quiz/Game;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lwtf/riceteacatpanda/quiz/Game$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
