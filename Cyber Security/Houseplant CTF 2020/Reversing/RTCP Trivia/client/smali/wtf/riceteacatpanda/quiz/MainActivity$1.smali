.class final Lwtf/riceteacatpanda/quiz/MainActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwtf/riceteacatpanda/quiz/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Lwtf/riceteacatpanda/quiz/MainActivity;


# direct methods
.method constructor <init>(Lwtf/riceteacatpanda/quiz/MainActivity;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$1;->b:Lwtf/riceteacatpanda/quiz/MainActivity;

    iput-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$1;->a:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$1;->a:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object p1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$1;->b:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "Enter your username!"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/MainActivity$1;->b:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-static {v0, p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->a(Lwtf/riceteacatpanda/quiz/MainActivity;Ljava/lang/String;)V

    return-void
.end method
