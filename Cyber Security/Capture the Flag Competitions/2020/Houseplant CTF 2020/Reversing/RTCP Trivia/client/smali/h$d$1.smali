.class final Lh$d$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh$d;


# direct methods
.method constructor <init>(Lh$d;)V
    .locals 0

    iput-object p1, p0, Lh$d$1;->a:Lh$d;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object p1, p0, Lh$d$1;->a:Lh$d;

    iget-object p2, p1, Lh$d;->a:Lm;

    invoke-virtual {p2}, Lm;->a()Z

    move-result p2

    iget-boolean v0, p1, Lh$d;->b:Z

    if-eq p2, v0, :cond_0

    iput-boolean p2, p1, Lh$d;->b:Z

    iget-object p1, p1, Lh$d;->e:Lh;

    invoke-virtual {p1}, Lh;->j()Z

    :cond_0
    return-void
.end method
